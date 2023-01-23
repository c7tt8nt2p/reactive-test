package com.example.reactiveapp01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldReactive01Controller {

    private final WebClient webClient;

    @Autowired
    public HelloWorldReactive01Controller(WebClient.Builder webClientBuilder) {
        this.webClient = WebClient.builder()
                .baseUrl("http://localhost:7002")
                .build();
    }

    public Mono<ServerResponse> execute(ServerRequest request) {
        Mono<String> publisher = webClient.get()
                .uri("/hello-world")
                .retrieve()
                .bodyToMono(String.class);
        return ServerResponse.ok().body(publisher, String.class);
    }


}
