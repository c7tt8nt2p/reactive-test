package com.example.servletapp01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldServlet01Controller {

    private final RestTemplate restTemplate;

    @Autowired
    public HelloWorldServlet01Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return restTemplate.getForEntity("http://localhost:8002/hello-world", String.class);
    }

}
