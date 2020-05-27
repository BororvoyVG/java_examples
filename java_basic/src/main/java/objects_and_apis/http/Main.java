package objects_and_apis.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    private static final String DATA_URL =
            "http://services.hanselandpetal.com/feeds/flowers.json";

    public static void main(String[] args)
            throws URISyntaxException, IOException, InterruptedException {
	// write your code here
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =
                HttpRequest.newBuilder()
                .uri(new URI(DATA_URL))
                .GET()
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
