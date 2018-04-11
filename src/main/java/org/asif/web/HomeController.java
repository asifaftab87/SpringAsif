package org.asif.web;

import org.asif.constants.Constants;
import org.asif.constants.StringPool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller																				//Declared to be a controller
@RequestMapping({StringPool.FORWARD_SLASH, StringPool.FORWARD_SLASH + Constants.HOME})
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)											//Handle GET request for
	public String home(){
		return Constants.HOME;															//View name is home
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegistrationForm(){
		
		
		return "registration-form";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String showRegistrationForm1(){
		
		
		return "registration-form";
	}
	
}
