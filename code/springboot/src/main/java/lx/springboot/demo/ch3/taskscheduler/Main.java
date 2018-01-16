package lx.springboot.demo.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SchedulerTaskConfig.class);
	
		Thread.sleep(60000);
		
		context.close();
	}
}
