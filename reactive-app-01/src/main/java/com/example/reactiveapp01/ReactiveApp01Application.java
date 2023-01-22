package com.example.reactiveapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApp01Application.class, args);
		System.out.println("PID => " + System.getProperty("PID"));;
	}

}
