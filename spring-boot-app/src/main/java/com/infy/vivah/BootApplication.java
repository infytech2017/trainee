package com.infy.vivah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
  Spring Boot developers always have their main class annotated with 
  @Configuration, @EnableAutoConfiguration and @ComponentScan. 
  Since these annotations are so frequently used together but now 
  Spring Boot provides a convenient @SpringBootApplication alternative.
  
  Why Spring Boot? Very Imp - https://dzone.com/articles/why-springboot
 */

@SpringBootApplication
//same as @Configuration @EnableAutoConfiguration @ComponentScan
public class BootApplication {
	public static void main(String[] args) {
		System.out.println("*** Starting - Spring Boot Application");
		SpringApplication.run(BootApplication.class, args);
		System.out.println("*** Started - Spring Boot Application");
	}
}
