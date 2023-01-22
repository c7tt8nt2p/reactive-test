package com.example.servletapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServletApp02Application {

    public static void main(String[] args) {
        SpringApplication.run(ServletApp02Application.class, args);
        System.out.println("PID => " + System.getProperty("PID"));;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
