package lx.springboot.demo.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Value("另一个类")
	private String annother;

	public String getAnnother() {
		return annother;
	}

	public void setAnnother(String annother) {
		this.annother = annother;
	}
	
	
}
