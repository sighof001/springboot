package lx.springboot.mvc.ch4_6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lx.springboot.mvc.MyMvcConfig;
import lx.springboot.mvc.service.DemoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTest {
	private MockMvc mockMvc;
	@Autowired
	private DemoService demoService;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void init(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void testNormalController() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/normal"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("page"))
			.andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/classes/views/page.jsp"))
			.andExpect(MockMvcResultMatchers.model().attribute("msg", demoService.saySomething()));
	}
	
	@Test
	public void testRestController() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/testRest"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string(demoService.saySomething()))
			.andExpect(MockMvcResultMatchers.content().contentType("text/plain;UTF-8"));
			
	}
}
