package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		
	    @BeforeTest
		public void beforeTest() {	
	    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	    	driver = new ChromeDriver();
		}
	    @Test				
		public void testEasy() {	
			driver.get("http://google.com");  
			
		}	
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}