package lx.springboot.mvc.web.ch4_3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lx.springboot.mvc.domain.DemoObj;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
	
	public @ResponseBody String iii(HttpServletRequest request){
		return "url:" + request.getRequestURL() + " can access";
	}
	
	@RequestMapping(produces = "text/plain;charset=UTF-8")
	public @ResponseBody String iii2(HttpServletRequest request){
		return "methed:iii2,url:" + request.getRequestURL() + " can access";
	}
	
	@RequestMapping(value = "/pathvar/{str}",produces = "text/plain;charset=UTF-8")
	public @ResponseBody String demoPathVar(@PathVariable String str,HttpServletRequest request){
		return "url:" + request.getRequestURL() + ",str:" + str;
	}
	
	@RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")
	public @ResponseBody String passRequestParam(Long id,HttpServletRequest request){
		return "url:" + request.getRequestURL() + ",id:" + id;
	}

	@RequestMapping(value = "/obj",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String passObj(DemoObj obj,HttpServletRequest request){
		return "url:" + request.getRequestURL() + ",obj.id:" + obj.getId() + ",obj.name:" + obj.getName();
	}
	
	@RequestMapping(value = {"/name1","/name2"} , produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String remove(HttpServletRequest request){
		return "url:" + request.getRequestURL();
	}
}
