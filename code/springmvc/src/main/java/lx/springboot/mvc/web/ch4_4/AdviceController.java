package lx.springboot.mvc.web.ch4_4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lx.springboot.mvc.domain.DemoObj;

@Controller
public class AdviceController {
	@RequestMapping("/advice")
	public String getSomthing(@ModelAttribute("msg") String msg,DemoObj obj){
		throw new IllegalArgumentException("参数有误，ModelAttribute信息：" + msg + ",obj.id:" + obj.getId() + ",obj.name:" + obj.getName());
	}
}
