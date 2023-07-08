package com.example.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.service.WelcomeService;

@WebMvcTest
public class WelcomeRestController {
	
	@MockBean
	private WelcomeService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	public void welcomeMsgTest() throws Exception {
		
		//defining mock obj behaviour
		when(service.getMsg()).thenReturn("Welcome to Ashok IT");
		
		//preparing request
		MockHttpServletRequestBuilder reqBuilder=MockMvcRequestBuilders.get("/welcome");
		
		//sending request
		MvcResult mvcResult=mockMvc.perform(reqBuilder).andReturn();
		
		//get the response
		MockHttpServletResponse response=mvcResult.getResponse();
	    
		//validate response status code
		int status=response.getStatus();
		assertEquals(200,status);
	}

}
