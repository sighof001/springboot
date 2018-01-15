package lx.springboot.demo.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService ufs = context.getBean(UseFunctionService.class);
		
		ufs.hehe("hahahah");
		
		context.close();
	}
}
