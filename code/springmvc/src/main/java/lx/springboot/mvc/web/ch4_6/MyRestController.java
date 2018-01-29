package lx.springboot.mvc.web.ch4_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lx.springboot.mvc.service.DemoService;

@RestController
public class MyRestController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value = "/testRest",produces = {"text/plain;utf-8"})
	public String rest(){
		return demoService.saySomething();
	}
}
