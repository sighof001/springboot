package lx.springboot.demo.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
	private static final long serialVersionUID = 7765491769656855451L;
	private String messge;
	
	public DemoEvent(Object source,String message) {
		super(source);
		this.messge = message;
	}

	public String getMessge() {
		return messge;
	}

	public void setMessge(String messge) {
		this.messge = messge;
	}

	
	
}
