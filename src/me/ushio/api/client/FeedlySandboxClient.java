package me.ushio.api.client;

import me.ushio.api.client.auth.oauth2.FeedlyTokenRequest;

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
    public FeedlySandboxClient(FeedlyTokenRequest request) throws IOException {
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
