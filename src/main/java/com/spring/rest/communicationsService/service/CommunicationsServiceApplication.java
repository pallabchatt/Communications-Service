package com.spring.rest.communicationsService.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.rest.communicationsService")
public class CommunicationsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicationsServiceApplication.class, args);
	}

}
