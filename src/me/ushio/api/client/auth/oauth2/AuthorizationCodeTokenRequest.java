package me.ushio.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

/**
 * Created by shugo on 2014/02/07.
 */
abstract class AuthorizationCodeTokenRequest extends com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest {

    /**
     * Client id parameter key name on api request.
     * @return
     */
    abstract String getClientIdFieldName();

    /**
     * Client secret parameter key name on api request.
     * @return
     */
    abstract String getClientSecretFieldName();

    /**
     * @inheritDoc
     */
    public AuthorizationCodeTokenRequest(HttpTransport transport, JsonFactory jsonFactory, GenericUrl tokenServerUrl, String code) {
        super(transport, jsonFactory, tokenServerUrl, code);
    }

    /**
     * Set client id.
     * @param clientId
     */
    public void setClientId(String clientId){
        String fieldName = this.getClientIdFieldName();

        this.set(fieldName, clientId);
    }

    /**
     * Set client secret.
     * @param clientSecret
     */
    public void setClientSecret(String clientSecret){
        String fieldName = this.getClientSecretFieldName();

        this.set(fieldName, clientSecret);
    }

}
