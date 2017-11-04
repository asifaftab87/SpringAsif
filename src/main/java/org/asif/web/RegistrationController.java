package org.asif.web;

import javax.validation.Valid;

import org.asif.data.ReaderRepository;
import org.asif.dto.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class RegistrationController {

	@Autowired 
	private ReaderRepository readerRepository;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegistrationForm() {
		return "register-form";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String processRegistration(@Valid Reader reader, Errors errors){
		
		reader = readerRepository.save(reader);
		
		if(errors.hasErrors()){
			return "register-form";
		}
		
		return "redirect:/user/profile/"+reader.getUserName()+"/"+reader.getLastName();
	}
	
	@RequestMapping(value="/profile/{userName}/{lastName}") 
	public String toProfilePage(@PathVariable("userName")String userName, 
								@PathVariable("lastName") String lastName, 
								Model model){
		model.addAttribute(readerRepository.findByName(userName));
		return "user-profile";
	}
	
}
