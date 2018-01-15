package lx.springboot.demo.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService u = new UseFunctionService();
		u.setFunctionService(functionService());
		
		return u;
	}
}
