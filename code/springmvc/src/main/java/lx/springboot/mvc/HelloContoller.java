package lx.springboot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {
	@RequestMapping("/index")
	public String hello(){
		return "index";
	}
	
}
