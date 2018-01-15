package lx.springboot.demo.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		UseFunctionService use = context.getBean(UseFunctionService.class);
		
		use.hehe();
		
		context.close();
	}
}
