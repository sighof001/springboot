package lx.springboot.demo.ch2.prepost;

public class BeanWayService {
	public void init(){
		System.out.println("@bean-init-method");
	}
	
	public BeanWayService() {
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}
	
	public void destroy(){
		System.out.println("@bean-destroy-method");
	}
}
