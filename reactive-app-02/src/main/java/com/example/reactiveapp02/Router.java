package com.example.reactiveapp02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> routes(HelloWorldReactive02Controller controller) {
        return RouterFunctions.route(GET("/hello-world"), controller::execute);
    }

}
