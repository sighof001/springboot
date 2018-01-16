package lx.springboot.demo.ch3.conditional;

public class LinuxListService implements ListService{
	@Override
	public String listDir() {
		return "ls";
	}

}
