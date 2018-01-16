package lx.springboot.demo.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		BeanWayService bws = context.getBean(BeanWayService.class);
		JSR250WayService jws = context.getBean(JSR250WayService.class);
		
		context.close();
	}
}
