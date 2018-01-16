package lx.springboot.demo.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
@Configuration
@ComponentScan("lx.springboot.demo.ch3.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor r = new ThreadPoolTaskExecutor();
		r.setCorePoolSize(5);
		r.setMaxPoolSize(10);
		r.setQueueCapacity(25);
		r.initialize();
		
		return r;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
