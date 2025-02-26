package com.qa.ui.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		//loading config.properties file
		prop =new Properties();
		try {
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/ui/config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialSetUp() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Temparature_project\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		//other browsers can be added too
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implict_load_timeout, TimeUnit.SECONDS);
		System.out.println(prop.getProperty("url"));
	//	driver.get(prop.getProperty("url"));;
			driver.navigate().to(prop.getProperty("url"));	
		
	}
	
}
