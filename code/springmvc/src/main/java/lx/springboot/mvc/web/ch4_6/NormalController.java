package lx.springboot.mvc.web.ch4_6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lx.springboot.mvc.service.DemoService;

@Controller
public class NormalController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/normal")
	public String normal(Model model){
		model.addAttribute("msg",demoService.saySomething());
		
		return "page";
	}
}
