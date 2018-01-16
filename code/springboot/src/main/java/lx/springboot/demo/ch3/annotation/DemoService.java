package lx.springboot.demo.ch3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	public void outputResult(){
		System.out.println("从组合配置获得的bean!!!");
	}
}
