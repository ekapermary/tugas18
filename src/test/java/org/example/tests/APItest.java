package org.example.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.requests.APIRequest;
import org.example.utilities.testUtilities;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;
import java.io.IOException;

public class APItest {
    private final APIRequest apiRequest = new APIRequest();

    @Test
    public void testPostEndpoint() throws IOException {
        String requestBody = testUtilities.readJsonFromFile("src/test/resources/request.json");
        Response response = apiRequest.postEndpoint("/path/to/endpoint", requestBody);
        assertEquals(201, response.getStatusCode());
        // Tambahkan validasi lain jika diperlukan
    }
}
