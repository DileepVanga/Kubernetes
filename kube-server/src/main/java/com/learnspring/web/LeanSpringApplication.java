package com.learnspring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.learnspring.controller"})
@SpringBootApplication
public class LeanSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeanSpringApplication.class, args);
	}
}
