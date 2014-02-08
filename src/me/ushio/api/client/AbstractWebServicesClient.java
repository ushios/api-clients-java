package me.ushio.api.client;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
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
     * Get Api host domain.
     * @return host name.
     */
    abstract public String getDomain();

    /**
     * Constructor
     *
     */
    public AbstractWebServicesClient(AuthorizationCodeTokenRequest request) throws IOException {
        TokenResponse response = request.execute();
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
     * Set authenticated token.
     * @param token
     */
    protected void setAuthenticatedToken(String token){
        this.authenticatedToken = token;
    }

    /**
     * Get authenticated token.
     * @return
     */
    protected String getAuthenticatedToken(){
        return this.authenticatedToken;
    }

}
