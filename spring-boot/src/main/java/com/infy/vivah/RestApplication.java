package com.infy.vivah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {
	public static void main(String[] args) {
		System.out.println("Starting - Spring Boot Application");
		SpringApplication.run(RestApplication.class, args);
		System.out.println("Started - Spring Boot Application");
	}
}
