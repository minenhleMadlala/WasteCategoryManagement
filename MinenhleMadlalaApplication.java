package com.enviro.assessment.grad001.MinenhleMadlala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marks this class as the main entry point of the Spring Boot application.
// Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan.
@SpringBootApplication
public class MinenhleMadlalaApplication {

	// The main method launches the Spring Boot application by initializing
	// the Spring context and running embedded servers like Tomcat.
	public static void main(String[] args) {
		SpringApplication.run(MinenhleMadlalaApplication.class, args);
	}
}
