package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Demo2Application {
	public static String DEMO_URL = "http://localhost:8081/demo";
	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			DEMO_URL = args[0];
		}
		SpringApplication.run(Demo2Application.class, args);
	}
}
