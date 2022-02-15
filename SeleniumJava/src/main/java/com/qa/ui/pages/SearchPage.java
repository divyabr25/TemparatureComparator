package com.qa.ui.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath = "//div[@class ='search-results']/div[@class = 'results-container']/div[1]")
	WebElement searchRes;
	
	public SearchPage() {
		initialSetUp(); 
		PageFactory.initElements(driver, this);
			
	}
	
	
	//Actions
	public static String ValidatePageTitle(){
		return driver.getTitle();	
	}
	
	@SuppressWarnings("deprecation")
	public SearchResultPage Search(String city) {//throws InterruptedException {
		System.out.println("What is the city name "+city);
		//initialSetUp();
		//PageFactory.initElements(driver, this);
		//Thread.sleep(20000);
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(searchField));
		 System.out.println("waited for 30 sec");
		 searchField.sendKeys(city);
		 
		 wait.until(ExpectedConditions.elementToBeClickable(searchRes));
		searchRes.click();
		/*
		 List<WebElement> option = driver.findElements(By.xpath("//div[@class ='search-results']/div[@class = 'results-container']/div[1]")); 
		 for(WebElement option1 : option)
		 { System.out.println(option1);
		  
		  }*/
		 
		//searchRes.sendKeys(Keys.ARROW_DOWN +""+ Keys.ENTER);
		//searchIcon.click();
		return new SearchResultPage();
	}


	
}
