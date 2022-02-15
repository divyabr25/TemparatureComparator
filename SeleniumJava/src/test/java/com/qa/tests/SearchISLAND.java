package com.qa.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.List;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.qa.ui.testBase.TestBase;


public class SearchISLAND extends TestBase {
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver","D:\\Temparature_project\\geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
	}
	
	@Test
	public void VerifyTitle() {
		try {
			String title = driver.getTitle();
			assertEquals(title, "ARR");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ValidateInputfields() {
		try {
			driver.findElement(By.id("search-input")).isDisplayed();
			assertTrue(true,"Query field is visible");
			driver.findElement(By.id("search-button")).isDisplayed();
			assertTrue(true,"Button field is visible");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void EmptyQuery(){
		try {
			driver.findElement(By.id("search-input")).sendKeys("");
			driver.findElement(By.id("search-button")).click();
			String errorMsg = driver.findElement(By.id("error-empty-query")).getText();
			assertEquals(errorMsg, "Provide some query");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void SearchIsland() {
		driver.findElement(By.id("search-input")).sendKeys("Isla");
		driver.findElement(By.id("search-button")).click();
		List<WebElement> items = driver.findElements(By.tagName("li"));
		assertTrue(items.size()>1);
	}
	
	@After
	public void close() {
		driver.close();
	}
	

}
