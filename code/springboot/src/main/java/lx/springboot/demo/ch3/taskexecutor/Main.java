package lx.springboot.demo.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		
		AsyncTaskService s = context.getBean(AsyncTaskService.class);
		
		for (int i = 0; i < 10; i++) {
			s.executeAsyncTask(i);
			s.executeAsyncTaskPlus(i);
		}
	}
}
