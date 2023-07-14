package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("Hello");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
}
