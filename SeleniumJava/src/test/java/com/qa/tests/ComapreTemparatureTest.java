package com.qa.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.runner.SearchRunner;
public class ComapreTemparatureTest {
	SearchRunner runner = new SearchRunner();
	
	@Test
	@Parameters(value = "Bengaluru")
	public void CompareTest() {
		//runner.searchCity(value);
		
	}
	
	

}
