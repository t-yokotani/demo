package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestRestTemplate {

    private final RestTemplate restTemplate;

    public static final String URL = "http://localhost:8080/list";

    public TestRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/getTestResponse")
    public List<TestResponse> getTestResponse() {
        ResponseEntity<List<TestResponse>> response = restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<TestResponse>>(){});
        List<TestResponse> body = response.getBody();

        return body;
    }
}
