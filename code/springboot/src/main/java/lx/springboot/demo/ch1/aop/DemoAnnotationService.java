package lx.springboot.demo.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
	@Action(name="注解拦截")
	public void add(){}
}
