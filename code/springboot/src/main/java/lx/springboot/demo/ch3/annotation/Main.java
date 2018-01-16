package lx.springboot.demo.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService ds = context.getBean(DemoService.class);
		ds.outputResult();
		
		context.close();
	}
}
