package com.infy;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRestControllerTest {
	@Autowired
	SpringRestController springRestControllerInst;
	

	

	@Test
	public void testGetReports() {
		
		//String json = new Gson().toJson(reps);
		Reports body = this.springRestControllerInst.getReports();
		
		 
		  
		   
	
		//Reports reports = springRestControllerInst.getReports();
		

	}

}