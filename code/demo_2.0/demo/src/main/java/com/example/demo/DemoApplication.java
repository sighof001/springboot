package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static String PATH = "D:/demo";

	public static void main(String[] args) {
		if (args != null && args.length > 0 ) {
			PATH = args[0];
		}
		SpringApplication.run(DemoApplication.class, args);
	}
}
