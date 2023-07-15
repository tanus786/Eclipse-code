package springmvc.controller;

//import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {
	@RequestMapping("/one")
	public String one() {
		return "redirect:/two";
	}

	@RequestMapping("/two")
	public String two() {
		return "";
	}
}
