package lx.springboot.ch7_2.advices;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionAdvices {
	@ExceptionHandler(value = Exception.class)
	public ModelAndView exceptionHandler(Exception ex,WebRequest request){
		ModelAndView m = new ModelAndView("error.html");
		m.addObject("errorMessage", ex.getMessage());
		return m;
	}
	
}
