package lx.springboot.demo.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		SingletonService ss1 = context.getBean(SingletonService.class);
		SingletonService ss2 = context.getBean(SingletonService.class);
		
		DemoPrototypeService ps1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService ps2 = context.getBean(DemoPrototypeService.class);
		
		System.out.println("is singleservice equals:" + ss1.equals(ss2));
		System.out.println("is prototypervice equals:" + ps1.equals(ps2));
		
		context.close();
	}
}
