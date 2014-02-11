package me.ushio.api.client.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

/**
 * Created by shugo on 2014/02/07.
 */
abstract class AbstractWebservicesAuthorizationCodeTokenRequest extends AuthorizationCodeTokenRequest {

    /**
     * @inheritDoc
     */
    public AbstractWebservicesAuthorizationCodeTokenRequest(HttpTransport transport, JsonFactory jsonFactory, GenericUrl tokenServerUrl, String code) {
        super(transport, jsonFactory, tokenServerUrl, code);
    }

}
