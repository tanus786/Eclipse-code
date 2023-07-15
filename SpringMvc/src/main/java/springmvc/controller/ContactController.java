package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	private UserService userService;
	
	@ModelAttribute
	public void commonModel(Model m) {
		m.addAttribute("Header", "Registration Form");
		m.addAttribute("desc","Fill the form");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping("/submit")
	public String submit(@ModelAttribute User user , Model model) {
		this.userService.createUser(user);
		return "success";
	}

//	@RequestMapping("/submit")
//	@RequestMapping(value ="/submit" , method = RequestMethod.POST)
//	public String submit(HttpServletRequest req) {
//		String email = req.getParameter("email");
//		System.out.println(email);
//		return "";
//	}

//	@RequestMapping(value = "/submit", method = RequestMethod.POST)
//	@RequestMapping("/submit")
	// RequestParam ke help se data fetch kr rhe the
//	public String submit(@RequestParam("email") String email, @RequestParam("name") String name,
//			@RequestParam("password") String password , Model model) {

	// Process data before sending
//		User user = new User();
//		user.setEmail(email);
//		user.setName(name);
//		user.setPassword(password);
//		model.addAttribute("user",user);

//		model.addAttribute("name",name);		
//		model.addAttribute("email",email);
//		model.addAttribute("password",password);

//		System.out.println(email);
//		System.out.println(name);
//		System.out.println(password);
//		return "success";
//	}

}
