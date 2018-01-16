package lx.springboot.demo.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener2 implements ApplicationListener<DemoEvent>{
	@Override
	public void onApplicationEvent(DemoEvent event) {
		String messge = event.getMessge();
		System.out.println("我(bean-demoListener2222222222)接收到了，bean-demoPublisher发布的消息：" + messge);
	}
}
