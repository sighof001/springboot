package lx.springboot.mvc.advice;


import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	@ExceptionHandler(value = Exception.class)
	public ModelAndView exceptionHandler(Exception ex,WebRequest request){
		ModelAndView m = new ModelAndView("error");
		m.addObject("errorMessage", ex.getMessage());
		return m;
	}
	
	@ModelAttribute
	public void addAttr(Model model){
		model.addAttribute("msg", "额外信息");
	}
	
	@InitBinder
	public void initBindler(WebDataBinder binder){
		binder.setDisallowedFields("id");
	}
}
