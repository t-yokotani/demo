package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRestTemplate {

    private final RestTemplate restTemplate;

    public static final String URL = "http://localhost:8080/listJson";

    public TestRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/getTestResponse")
    public TestResponse getTestResponse() {
        return restTemplate.getForObject(URL,TestResponse.class);
    }
}
