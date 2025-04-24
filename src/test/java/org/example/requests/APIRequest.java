package org.example.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIRequest {
    private static final String BASE_URL = "https://api.example.com";

    public Response getEndpoint(String endpoint) {
        return RestAssured.get(BASE_URL + endpoint);
    }

    public Response postEndpoint(String endpoint, Object body) {
        return RestAssured.given().body(body).post(BASE_URL + endpoint);
    }
}
