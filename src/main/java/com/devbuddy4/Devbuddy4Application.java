package com.devbuddy4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.devbuddy4.backend.persistence.repositories")
public class Devbuddy4Application {

	public static void main(String[] args) {
		SpringApplication.run(Devbuddy4Application.class, args);
	}
}
