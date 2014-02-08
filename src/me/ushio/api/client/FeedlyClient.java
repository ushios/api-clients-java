package me.ushio.api.client;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;

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
    public FeedlyClient(AuthorizationCodeTokenRequest request) throws IOException {
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
