package com.qa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ui.testBase.TestBase;

public class SearchResultPage extends TestBase {
	
	
	@FindBy(xpath="//a[1]/div[@class ='cur-con-weather-card__body']/div[@class ='cur-con-weather-card__panel']/div/div/div[@class='temp']")
	WebElement UItemp;
	
	SearchPage sp;
	
	public SearchResultPage() {
		// TODO Auto-generated constructor stub
		//this.driver = driver;
		PageFactory.initElements(driver, this);	
		//sp = new SearchPage();
		
	}
	
	//Get the temparature
	public int getUITemp() {
		
		String uiTemp = UItemp.getText();
		System.out.println("temparature in string "+uiTemp);
		uiTemp = uiTemp.substring(0,2);
		int uiTemp_int = Integer.parseInt(uiTemp);
		return uiTemp_int;
		
	}
	//validate result title
	public String ValidateResultPageTitle(){
		return driver.getTitle();	
	}
	


	
}
