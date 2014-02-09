package me.ushio.api.client;

import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;

import java.io.IOException;

/**
 * Created by shugo on 2014/02/05.
 */
abstract class AbstractWebServicesClient implements WebServicesClientInterface {

    /**
     * Api token.
     */
    protected String authenticatedToken;

    /**
     * refresh token.
     */
    protected String refreshToken;

    /**
     * Get Api host domain.
     * @return host name.
     */
    abstract public String getDomain();

    /**
     * Constructor
     *
     */
    public AbstractWebServicesClient(TokenRequest request) throws IOException {
        TokenResponse response = request.execute();
        this.setAuthenticatedToken(response.getAccessToken());
        this.setRefreshToken(response.getRefreshToken());
    }

    /**

     * Get GenericUrl instance from api url.
     * @return api GenericUrl
     */
    protected GenericUrl getGenericUrl(){
        String url = this.getApiUri();
        GenericUrl genericUrl = new GenericUrl(url);

        return genericUrl;
    }

    /**
     * Return http or https
     * @return http or https
     */
    protected String getProtocol(){
        return "https";
    }

    /**
     * Get api endpoint url
     * @return api endpoint url
     */
    protected String getApiUri(){
        String protocol = this.getProtocol();
        String domain = this.getDomain();

        return protocol + "://" + domain;
    }

    /**
     * Get authenticated token.
     * @return
     */
    public String getAuthenticatedToken(){
        return this.authenticatedToken;
    }

    /**
     * Set authenticated token.
     * @param token
     */
    protected void setAuthenticatedToken(String token){
        this.authenticatedToken = token;
    }

    /**
     * Get refresh token.
     * @return
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Set refresh token.
     * @param refreshToken
     */
    protected void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
