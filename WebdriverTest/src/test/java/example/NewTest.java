package example;		

import java.io.IOException;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;

import com.nexmo.client.NexmoClientException;



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
	    	options.addArguments("--headless", "--disable-gpu", "--ignore-certificate-errors");
	    	driver = new ChromeDriver(options);
	    	//driver = new FirefoxDriver();
		}
	    @Test				
		public void testEasy() throws IOException, NexmoClientException {
	    	String expectedTitle = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl = "http://theluxurycloset.com";
	    	driver.get(expectedUrl);  
	    	try{
	    		  Assert.assertEquals(expectedTitle, driver.getTitle());
	    		  System.out.println("Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("Website is Down");
	    		  SendSMS Sp = new SendSMS();
					Sp.FailSMS();
					
	    		}
	    	
		}	
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}