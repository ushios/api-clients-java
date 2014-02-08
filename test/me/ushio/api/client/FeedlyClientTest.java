package me.ushio.api.client;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import junit.framework.TestCase;
import me.ushio.api.client.auth.oauth2.FeedlyTokenRequest;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by shugo on 2014/02/08.
 */
public class FeedlyClientTest extends TestCase {
    public void testGetDomain() throws Exception {
        NetHttpTransport transport = new NetHttpTransport();
        JsonFactory jsonFactory = new JacksonFactory();
        String code = "";
        GenericUrl url = new GenericUrl("https://sandbox.feedly.com/v3/auth/token");

        FeedlyTokenRequest request = new FeedlyTokenRequest(
                transport,
                jsonFactory,
                url,
                code
        );
        request.setClientId("sandbox");
        request.setClientSecret("CM786L1D4P3M9VYUPOB8");
        request.set("grant_type", "authorization_code");
        request.set("state", "token");
        request.set("redirect_uri", "http://localhost");

        FeedlyClient client = new FeedlySandboxClient(request);
    }
}
