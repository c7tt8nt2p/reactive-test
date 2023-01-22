package com.example.reactiveapp02;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Component
public class HelloWorldReactive02Controller {

    public Mono<ServerResponse> execute(ServerRequest request) {
        Mono<String> publisher = Mono.just("hello-world from reactive-app-02")
                .delayElement(Duration.ofSeconds(2));
        return ServerResponse.ok().body(publisher, String.class);
    }
}
