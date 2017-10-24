package org.asif.web.test;

import static org.junit.Assert.assertEquals;

import org.asif.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class HomeControllerTest {

	
	public void homeTestPage(){
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
	
	@Test
	public void testHomePage() throws Exception{
	
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();			//setup mockmvc object for test
		mockMvc.perform(get("/"))										//Request GET method
			.andExpect(view().name("home"));							//expect jsp page name
		
	}
	
}
