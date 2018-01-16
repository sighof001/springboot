package lx.springboot.demo.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService ls = context.getBean(ListService.class);
		
		System.out.println(ls.listDir());
		
		context.close();
		
	}
}
