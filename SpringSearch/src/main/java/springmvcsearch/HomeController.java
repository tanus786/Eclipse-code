package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.web.bind.annotation.ResponseStatus;
@Controller
public class HomeController {

	@RequestMapping("/homes")
	public String home() {
		return "home1";
	}

	// handling the request
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name, Model m) {
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcome";
	}
}
