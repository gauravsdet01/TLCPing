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
	    @Test(priority = 1)			
		public void testEasy() throws IOException, NexmoClientException {
	    	String expectedTitle1 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl1 = "http://theluxurycloset.com";
	    	driver.get(expectedUrl1);  
	    	try{
	    		  Assert.assertEquals(expectedTitle1, driver.getTitle());
	    		  System.out.println("Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("Website is Down");
	    		  SendSMS Sp = new SendSMS();
					Sp.FailSMS();
					
					
	    		}
	    	
		}	
	    @Test(priority = 2)	
	    public void DekstopIpOne() throws IOException, NexmoClientException {
	    	String expectedTitle2 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl2 = "http://188.166.33.121/";
	    	driver.get(expectedUrl2);  
	    	try{
	    		  Assert.assertEquals(expectedTitle2, driver.getTitle());
	    		  System.out.println("188.166.33.121 Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.33.121 Website is Down");
	    		  SendSMSDI1 Sp1 = new SendSMSDI1();
					Sp1.FailSMS();
					
	    		}
	    	
		}
	    
	    @Test(priority = 3)	
	    public void DekstopIpTwo() throws IOException, NexmoClientException {
	    	String expectedTitle3 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl3 = "http://188.166.26.197/";
	    	driver.get(expectedUrl3);  
	    	try{
	    		  Assert.assertEquals(expectedTitle3, driver.getTitle());
	    		  System.out.println("188.166.26.197 Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.26.197 Website is Down");
	    		  SendSMSDI2 Sp2 = new SendSMSDI2();
					Sp2.FailSMS();
					
	    		}
	    	
		}	
	    @Test(priority = 4)	
	    public void DekstopIpThree() throws IOException, NexmoClientException {
	    	String expectedTitle4 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl4 = "http://188.166.90.228/";
	    	driver.get(expectedUrl4);  
	    	try{
	    		  Assert.assertEquals(expectedTitle4, driver.getTitle());
	    		  System.out.println("188.166.90.228 Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.90.228 Website is Down");
	    		  SendSMSDI3 Sp3 = new SendSMSDI3();
					Sp3.FailSMS();
					
	    		}
	    	
		}
	    @Test(priority = 5)	
	    public void APIIpOne() throws IOException, NexmoClientException {
	    	String expectedTitle5 = "Page Title";
	    	String expectedUrl5 = "http://128.199.51.73/";
	    	driver.get(expectedUrl5);  
	    	try{
	    		  Assert.assertEquals(expectedTitle5, driver.getTitle());
	    		  System.out.println("128.199.51.73 Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("128.199.51.73 Website is Down");
	    		  SendSMSAPI1 Sp4 = new SendSMSAPI1();
					Sp4.FailSMS();
					
	    		}
	    	
		}
	    @Test(priority = 6)	
	    public void APIIpTwo() throws IOException, NexmoClientException {
	    	String expectedTitle6 = "Welcome to nginx!";
	    	String expectedUrl6 = "http://188.166.63.53/";
	    	driver.get(expectedUrl6);  
	    	try{
	    		  Assert.assertEquals(expectedTitle6, driver.getTitle());
	    		  System.out.println("188.166.63.53 Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.63.53 Website is Down");
	    		  SendSMSAPI2 Sp5 = new SendSMSAPI2();
					Sp5.FailSMS();
					
	    		}
	    	
		}

	/*
	 * @Test(priority = 7) public void AdminIpOne() throws IOException,
	 * NexmoClientException { String expectedTitle7 =
	 * "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	 * String expectedUrl7 = "http://188.166.40.127/"; driver.get(expectedUrl7);
	 * try{ Assert.assertEquals(expectedTitle7, driver.getTitle());
	 * System.out.println("Website is up"); } catch(Throwable pageNavigationError){
	 * System.out.println("Website is Down"); SendSMSAdmin1 Sp6 = new
	 * SendSMSAdmin1(); Sp6.FailSMS();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(priority = 8) public void AdminIpTwo() throws IOException,
	 * NexmoClientException { String expectedTitle8 =
	 * "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	 * String expectedUrl8 = "http://188.166.90.227/"; driver.get(expectedUrl8);
	 * try{ Assert.assertEquals(expectedTitle8, driver.getTitle());
	 * System.out.println("Website is up"); } catch(Throwable pageNavigationError){
	 * System.out.println("Website is Down"); SendSMSAdmin2 Sp7 = new
	 * SendSMSAdmin2(); Sp7.FailSMS();
	 * 
	 * }
	 * 
	 * }
	 */
	    @Test(priority = 7)	
	    public void LBIpOne() throws IOException, NexmoClientException {
	    	String expectedTitle9 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl9 = "http://188.166.77.29/";
	    	driver.get(expectedUrl9);  
	    	try{
	    		  Assert.assertEquals(expectedTitle9, driver.getTitle());
	    		  System.out.println("188.166.77.29 Website is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.77.29 Website is Down");
	    		  SendSMSLB1 Sp8 = new SendSMSLB1();
					Sp8.FailSMS();
					
	    		}
	    	
		}

	/*
	 * @Test(priority = 10) public void LBIptwo() throws IOException,
	 * NexmoClientException { String expectedTitle10 = "Page Title"; String
	 * expectedTitle10_1 = "Welcome to nginx!"; String expectedUrl10 =
	 * "http://178.128.138.184/"; driver.get(expectedUrl10); try{ driver.wait(5000);
	 * try { Assert.assertEquals(expectedTitle10, driver.getTitle());
	 * 
	 * } catch(Throwable pageNavigationError) {
	 * Assert.assertEquals(expectedTitle10_1, driver.getTitle()); }
	 * System.out.println("178.128.138.184 Website is up"); }
	 * 
	 * catch(Throwable pageNavigationError){
	 * System.out.println("178.128.138.184 Website is Down"); SendSMSLB2 Sp9 = new
	 * SendSMSLB2(); Sp9.FailSMS();
	 * 
	 * }
	 * 
	 * }
	 */
//	    @Test(priority = 8)	
//	    public void CDNIP() throws IOException, NexmoClientException {
//	    	String expectedTitle11 = "TLC_EN.png (772×120)";
//	    	String expectedUrl11 = "http://cdn.theluxurycloset.com/themes/gucci/images/TLC_EN.png";
//	    	driver.get(expectedUrl11);  
//	    	try{
//	    		driver.wait(3000);
//	    		  Assert.assertEquals(expectedTitle11, driver.getTitle());
//	    		  System.out.println("CDN Website is up");
//	    		}
//	    		catch(Throwable pageNavigationError){
//	    		  System.out.println("CDN Website is Down");
//	    		  SendSMSCDN Sp10 = new SendSMSCDN();
//					Sp10.FailSMS();
//					
//	    		}
//	    	
//		}
	   
	    
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}