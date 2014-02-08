package me.ushio.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

/**
 * Created by shugo on 2014/02/08.
 */
public class FeedlyTokenRequest extends AuthorizationCodeTokenRequest {
    /**
     * Client id parameter key name on api request.
     *
     * @return
     */
    @Override
    String getClientIdFieldName() {
        return "client_id";
    }

    /**
     * Client secret parameter key name on api request.
     *
     * @return
     */
    @Override
    String getClientSecretFieldName() {
        return "client_secret";
    }

    public FeedlyTokenRequest(HttpTransport transport, JsonFactory jsonFactory, GenericUrl tokenServerUrl, String code) {
        super(transport, jsonFactory, tokenServerUrl, code);
    }
}
