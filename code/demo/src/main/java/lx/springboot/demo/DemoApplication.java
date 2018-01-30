package lx.springboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	@Value("${aaa}")
	private String id;
	
	@Value("${bbb}")
	private String name;
	
	@RequestMapping("/")
	public String index() {
		return "hello spring boot,id:" + id + ",name:" + name;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
