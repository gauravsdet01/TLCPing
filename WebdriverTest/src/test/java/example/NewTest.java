package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	    	//System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
	    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\git\\repository2\\WebdriverTest\\Driver\\chromedriver.exe");
	    	//driver = new ChromeDriver();
	    	ChromeOptions options = new ChromeOptions();  
	    	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
	    	driver = new ChromeDriver(options);
	    	//driver = new FirefoxDriver();
		}
	    @Test				
		public void testEasy() {	
			driver.get("http://theluxurycloset.com");  
			
		}	
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}