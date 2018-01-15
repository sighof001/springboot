package lx.springboot.demo.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public void sayHello(){
		System.out.println("hello spring!!");
	}
}
