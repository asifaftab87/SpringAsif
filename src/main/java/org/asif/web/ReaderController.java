package org.asif.web;

import java.util.List;

import org.asif.data.ReaderRepository;
import org.asif.data.impl.ReaderRepositoryImpl;
import org.asif.dto.Reader;
import org.asif.util.MethodUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller																				//Declared to be a controller
public class ReaderController {

	/*public ReaderController(ReaderRepository readerRepository){
		readerRepository = new ReaderRepositoryImpl();
	}*/
	
	@RequestMapping(value="/reader", method=RequestMethod.GET)
	public String view(){
		return "readers";
	}
	
	@ModelAttribute("readerList")
	public List<Reader> getReaderList(){
		ReaderController readerController = new ReaderController();
		return MethodUtil.getFullReaderList();
	}
}
