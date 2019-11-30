package micronaut.demo.controller;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class ControllerTest {
    @Inject
    Controller controller;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void test_sum() {
        int a = 23;
        int r = 44;
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/demo/sum/23/44"));

        assertEquals(response, "627");
    }

}