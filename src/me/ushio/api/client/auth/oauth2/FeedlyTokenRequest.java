package me.ushio.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

/**
 * Created by shugo on 2014/02/08.
 */
public class FeedlyTokenRequest extends AuthorizationCodeTokenRequest {

    public FeedlyTokenRequest(HttpTransport transport, JsonFactory jsonFactory, GenericUrl tokenServerUrl, String code) {
        super(transport, jsonFactory, tokenServerUrl, code);

        this.setGrantType("authorization_code");
        this.setState("token");
    }

    /**
     * Set client id.
     * @param clientId
     */
    public void setClientId(String clientId){
        this.set("client_id", clientId);
    }

    /**
     * Set client secret.
     * @param clientSecret
     */
    public void setClientSecret(String clientSecret){
        this.set("client_secret", clientSecret);
    }

    /**
     * Set state.
     * @param state
     */
    public void setState(String state){
        this.set("state", state);
    }


}
