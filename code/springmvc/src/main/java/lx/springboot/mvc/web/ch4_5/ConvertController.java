package lx.springboot.mvc.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lx.springboot.mvc.domain.DemoObj;

@Controller
public class ConvertController {
	@RequestMapping(value = "convert",produces = "application/lx")
	public @ResponseBody DemoObj convert(@RequestBody DemoObj obj){
		return obj;
	}
}
