package webcrawler.books.crawler;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Crawler {

    public static String getBookShelf(String URL, String headersName, String headersValue) throws IOException {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet req = new HttpGet(URL);
        req.addHeader(headersName, headersValue);
        HttpResponse res = client.execute(req);

        return EntityUtils.toString(res.getEntity());
    }
}
