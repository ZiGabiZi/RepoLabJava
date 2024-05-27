package task2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Random;

public class HttpClientExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        Random random = new Random();
        int randomId = random.nextInt(100) + 1;

        getResourceById(client, randomId);

        createNewResource(client);
    }

    public static void getResourceById(HttpClient client, int id) throws IOException, InterruptedException {
        String uri = "https://jsonplaceholder.typicode.com/posts/" + id;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println("GET Response:");
        System.out.println(response.body());
    }

    public static void createNewResource(HttpClient client) throws IOException, InterruptedException {
        String uri = "https://jsonplaceholder.typicode.com/posts";

        String json = """
                {
                    "title": "foo",
                    "body": "bar",
                    "userId": 1
                }
                """;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println("POST Request JSON:");
        System.out.println(json);

        System.out.println("POST Response:");
        System.out.println(response.body());
    }
}
