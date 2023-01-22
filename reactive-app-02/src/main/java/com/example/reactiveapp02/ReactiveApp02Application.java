package com.example.reactiveapp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveApp02Application {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApp02Application.class, args);
		System.out.println("PID => " + System.getProperty("PID"));;
	}

}
