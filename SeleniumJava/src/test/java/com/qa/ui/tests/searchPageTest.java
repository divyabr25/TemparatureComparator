package com.qa.ui.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ui.pages.SearchPage;
import com.qa.ui.pages.SearchResultPage;
import com.qa.ui.testBase.TestBase;
import com.qa.uiSource.UISource;

public class searchPageTest extends TestBase{
	SearchPage sp;   
	SearchResultPage srp;
	UISource tempFactory = new UISource();
	
	
	public searchPageTest() {
		super();//initialises properties calls testBaseclss constructor
	}
	
	@BeforeMethod
	public void setUp() {
		initialSetUp();
		sp = new SearchPage();
		
		
	}
	@Test(priority = 1)
	public void validateSearchPageTitle() {
		String title = SearchPage.ValidatePageTitle();
		Assert.assertEquals(title,"Local, National, & Global Daily Weather Forecast | AccuWeather","OnsearchPage");
		System.out.println("validated "+title);
		
	}
	
	@Test(priority = 2)
	public void searchCity() {
		System.out.println("second method in 1 ");
		//tempFactory.getTemperature("Bengaluru,KA");
		//srp = sp.Search(city);
	}
	
	@AfterMethod
	public void tearDown() { 
		driver.quit(); 
		}
	 
	
	
	
}