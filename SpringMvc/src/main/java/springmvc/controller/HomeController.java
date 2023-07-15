package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
//	@RequestMapping(value ="/home" , method = RequestMethod.GET)
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Hello This is Home");
		//Using model
		model.addAttribute("name", "Tanu Soni");
		model.addAttribute("number", 979296538);
		List<String> friends = new ArrayList<String>();
		friends.add("Neeru");
		friends.add("Banti");
		friends.add("Tanu");
		model.addAttribute("fri", friends);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name","Rajkumar Seth");
		modelAndView.addObject("id", 123);
		LocalDateTime localDateTime = LocalDateTime.now();
		modelAndView.addObject("date",localDateTime);
		List<String> friends = new ArrayList<String>();
		friends.add("Vanshika");
		friends.add("updesh");
		friends.add("upasana");
		modelAndView.addObject("fri", friends);
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
