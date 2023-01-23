package com.example.servletapp01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldServlet02Controller {

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() throws InterruptedException {
        Thread.sleep(5000);
        return ResponseEntity.ok("hello-world from servlet-app-02");
    }

}
