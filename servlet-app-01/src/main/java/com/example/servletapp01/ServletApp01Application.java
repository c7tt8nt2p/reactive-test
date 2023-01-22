package com.example.servletapp01;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServletApp01Application {

//	@Autowired
//	private ServerProperties serverProperties;
//
//	@PostConstruct
//	public void init() {
//		System.out.println("==============================");
//		System.out.println("Max threads: " + serverProperties.getTomcat().getThreads().getMax());
//		System.out.println("==============================");
//	}

    public static void main(String[] args) {
        SpringApplication.run(ServletApp01Application.class, args);
        System.out.println("PID => " + System.getProperty("PID"));;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
