package lx.springboot.ch7_2.advices;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
	@ModelAttribute
	public void addAttr(Model model,HttpServletRequest request) {
		model.addAttribute("cxt", request.getContextPath());
	}
}
