package org.asif.web;

import java.util.List;

import org.asif.constants.ApplicationURL;
import org.asif.data.ReaderRepository;
import org.asif.dto.Reader;
import org.asif.util.MethodUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller																				//Declared to be a controller
@RequestMapping(ApplicationURL.READER)
public class ReaderController {

	@Autowired
	private ReaderRepository readerRepository;	
	
	//@Autowired
	public ReaderController(ReaderRepository readerRepository){
		this.readerRepository = readerRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String view(Model model){
		model.addAttribute("readerList", readerRepository.findReader(Long.MAX_VALUE, 20));
		return "readers";
	}
	
	@ModelAttribute("readerList")
	public List<Reader> getReaderList(){
		return MethodUtil.getFullReaderList();
	}
	
	@RequestMapping(value=ApplicationURL.READER_TWO, method=RequestMethod.GET)
	public String secondReader(@RequestParam("max") long max, @RequestParam("count") int count , Model model){
		model.addAttribute("readerList", readerRepository.findReader(max, count));
		return "readers";
	}
	
	
	@RequestMapping(value=ApplicationURL.READER_THREE + "/{id}", method=RequestMethod.GET)
	public String thirdReader(@PathVariable("id") int id, Model model){
		
		model.addAttribute("reader", readerRepository.findOne(id));
		return "readers-one";
	}
	
	
}



