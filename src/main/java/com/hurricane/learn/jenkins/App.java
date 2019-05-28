package com.hurricane.learn.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hurricane.learn.jenkins.controller.UserController;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(App.class);
		application.run(args);
//		System.out.println("from java");
	}
	
	
}
