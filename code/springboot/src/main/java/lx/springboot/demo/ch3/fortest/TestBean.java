package lx.springboot.demo.ch3.fortest;

public class TestBean {
	public TestBean(String content){
		this.content = content;
	}
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
