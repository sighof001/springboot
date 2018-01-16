package lx.springboot.demo.ch3.conditional;

public class WindowsListService implements ListService{

	@Override
	public String listDir() {
		return "dir";
	}

}
