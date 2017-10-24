package org.asif.web;

import org.asif.constants.StringPool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller															//Declared to be a controller
public class HomeController {

	@RequestMapping(value=StringPool.FORWARD_SLASH, method=RequestMethod.GET)			//Handle GET request for
	public String home(){
		return "home";												//View name is home
	}
	
}
