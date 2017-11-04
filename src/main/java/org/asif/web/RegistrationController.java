package org.asif.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class RegistrationController {

	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegistrationForm() {
		return "register-form";
	}
	
}
