package lx.springboot.demo.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		
		AwareService as = context.getBean(AwareService.class);
		
		as.outputResult();
		
		context.close();
	}
}
