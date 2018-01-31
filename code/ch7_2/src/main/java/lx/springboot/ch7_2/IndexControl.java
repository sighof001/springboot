package lx.springboot.ch7_2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControl {
	@RequestMapping("/index")
	public String index(Model model) {
		Person singlePerson = new Person("风一样的男子",22);
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("李雷", 111));
		list.add(new Person("韩梅梅", 112));
		list.add(new Person("aaa", 1133));
		list.add(new Person("bbb", 1144));

		model.addAttribute("singlePerson",singlePerson);
		model.addAttribute("list",list);
		
		return "index.html";
	}
}
