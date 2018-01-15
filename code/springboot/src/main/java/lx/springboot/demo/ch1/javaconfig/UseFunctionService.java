package lx.springboot.demo.ch1.javaconfig;

public class UseFunctionService {
	private FunctionService functionService;
	
	public FunctionService getFunctionService() {
		return functionService;
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public void hehe(String word){
		System.out.println(functionService.sayHell(word));
	}
}
