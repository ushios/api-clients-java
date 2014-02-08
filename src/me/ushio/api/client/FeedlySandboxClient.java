package me.ushio.api.client;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;

import java.io.IOException;

/**
 * Created by shugo on 2014/02/08.
 */
public class FeedlySandboxClient extends FeedlyClient {


    /**
     * Constructor
     *
     * @param request
     */
    public FeedlySandboxClient(AuthorizationCodeTokenRequest request) throws IOException {
        super(request);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getDomain() {
        return "sandbox.feedly.com";
    }
}
