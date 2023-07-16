package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping("/form")
	public String showFom() {

		return "Form";
	}

//	@RequestMapping("/handle")
	@RequestMapping(path = "/handle", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("student") Student student , BindingResult result) {
		if(result.hasErrors()) {
			return "Form";
		}
		System.out.println(student);
		return "success";
	}
}
