package com.qa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ui.testBase.TestBase;

public class SearchPage extends TestBase {
	
	//Page Factory
	@FindBy(name = "query")
	WebElement searchField;
	
	@FindBy(xpath = "//div[@class='searchbar-content']/*[local-name()='svg'][1]")
	WebElement searchIcon;
	
	
	
	public SearchPage() {
		//initialSetUp(); 
		PageFactory.initElements(driver, this);
			
	}
	
	
	//Actions
	public static String ValidatePageTitle(){
		return driver.getTitle();	
	}
	
	@SuppressWarnings("deprecation")
	public SearchResultPage Search(String city) {
		System.out.println("What is the city name "+city);
		//initialSetUp();
		//PageFactory.initElements(driver, this);	
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(searchField));
		searchField.sendKeys(city);
		searchIcon.click();
		return new SearchResultPage();
	}


	
}
