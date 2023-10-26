package com.harshitdoshi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// convenience annotation that adds the following annotations behind-the-scenes:
// @Configuration
// @EnableAutoConfiguration
// @ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
