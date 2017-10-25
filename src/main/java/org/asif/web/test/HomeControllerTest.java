package org.asif.web.test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.util.List;

import org.asif.data.ReaderRepository;
import org.asif.dto.Reader;
import org.asif.util.MethodUtil;
import org.asif.web.HomeController;
import org.asif.web.ReaderController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

public class HomeControllerTest {

	
	public void homeTestPage(){
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
	
	
	public void testHomePage() throws Exception{
	
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();			//setup mockmvc object for test
		mockMvc.perform(get("/"))										//Request GET method
			.andExpect(view().name("home"));							//expect jsp page name
	}
	
	
	
	@Test
	public void shouldShowRecentSpittles() throws Exception {
	List<Reader> expectedReaders = MethodUtil.createReaderList(20);
	ReaderRepository mockRepository = mock(ReaderRepository.class);
	when(mockRepository.findReader(Long.MAX_VALUE, 20)).thenReturn(expectedReaders);
	ReaderController controller = new ReaderController();
	
	MockMvc mockMvc = standaloneSetup(controller).setSingleView(new InternalResourceView("/WEB-INF/views/readers.jsp")).build();
	mockMvc.perform(get("/reader")).andExpect(view().name("readers"))
									 .andExpect(model().attributeExists("readerList"))
									 .andExpect(model().attribute("readerList", hasItems(expectedReaders.toArray())));
	
	}
}
