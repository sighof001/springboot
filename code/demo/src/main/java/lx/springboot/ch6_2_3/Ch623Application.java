package lx.springboot.ch6_2_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lx.springboot.ch6_2_3.config.AuthorSettings;

@RestController
@SpringBootApplication
public class Ch623Application {
	@Autowired
	private AuthorSettings authorSettings;
	
	@RequestMapping("/")
	public String index() {
		return "author.name:" + authorSettings.getName() + ",author.age:" + authorSettings.getAge();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch623Application.class, args);
	}
}
