package lx.springboot.mvc.web.ch4_3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lx.springboot.mvc.domain.DemoObj;

@RequestMapping("/rest")
@RestController
public class DemoRestController {
	@RequestMapping(value = "/getXml",produces = "application/xml;charset=UTF-8")
	public DemoObj getXml(DemoObj obj){
		return new DemoObj(obj.getId() + 10000,obj.getName() + "xml");
	}
	@RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
	public DemoObj getJson(DemoObj obj){
		return new DemoObj(obj.getId() + 20000,obj.getName() + "json");
	}
}
