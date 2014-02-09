package me.ushio.api.client;

import me.ushio.api.client.auth.oauth2.FeedlyTokenRequest;

import java.io.IOException;

/**
 * Created by shugo on 2014/02/07.
 */
public class FeedlyClient extends AbstractWebServicesClient {


    /**
     * Constructor
     *
     * @param request
     */
    public FeedlyClient(FeedlyTokenRequest request) throws IOException {
        super(request);
    }

    /**
     * Get Api host domain.
     * @return host name.
     */
    @Override
    public String getDomain() {
        return "cloud.feedly.com";
    }
}
