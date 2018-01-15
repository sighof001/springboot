package lx.springboot.demo.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UseFunctionService {
	@Autowired
	private FunctionService functionService;
	
	public void hehe(){
		functionService.sayHello();
	}
}
