package com.example.demo.controller;
import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("/")
	public String home() {
		return "Hello World!1133311";
	}

	@RequestMapping("/demo")
	public String demo(String time) {
		try {
			String dirPath = "D:/demo";
			File dir = new File(dirPath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			File file = new File(dirPath + "/" + time + ".txt");
			file.createNewFile();
			
			return "ok";
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			return "hehe";
		}
	}
}