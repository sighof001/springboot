package lx.springboot.demo.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
	@Action(name="ע�����ص�add����")
	public void add(){}
}
