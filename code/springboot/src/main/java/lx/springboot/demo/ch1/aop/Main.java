package lx.springboot.demo.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoMethodService dms = context.getBean(DemoMethodService.class);
		dms.add();
		
		DemoAnnotationService das = context.getBean(DemoAnnotationService.class);
		das.add();
		
		context.close();
	}
}
