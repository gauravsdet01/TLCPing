package example;		

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	        
	    	//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver"); //On server
	    	////System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
	    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\git\\repository2\\WebdriverTest\\Driver\\chromedriver.exe"); //on local
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    	//driver = new ChromeDriver();
	    	ChromeOptions options = new ChromeOptions();  
	    	options.addArguments("--headless", "--disable-gpu", "--ignore-certificate-errors");
	    	driver = new ChromeDriver(options);
	    	//driver = new FirefoxDriver();	
		}
	    @Test(priority = 1)			
		public void testEasy() throws IOException, NexmoClientException {
	    	String expectedTitle1 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl1 = "http://theluxurycloset43.com";
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
	    		  System.out.println("188.166.33.121 is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.33.121 is Down");
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
	    		  System.out.println("188.166.26.197 is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.26.197 is Down");
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
	    		  System.out.println("188.166.90.228 is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.90.228 is Down");
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
	    		  System.out.println("128.199.51.73 is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("128.199.51.73 is Down");
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
	    		  System.out.println("188.166.63.53 is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.63.53 is Down");
	    		  SendSMSAPI2 Sp5 = new SendSMSAPI2();
					Sp5.FailSMS();
					
	    		}
	    	
		}

	
//	@Test(priority = 7)
//	public void AdminIpOne() throws IOException, NexmoClientException {
//		String expectedTitle7 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
//		String expectedUrl7 = "http://admin.theluxurycloset.com";
//		driver.get(expectedUrl7);
//		try {
//			Assert.assertEquals(expectedTitle7, driver.getTitle());
//			System.out.println("Website is up");
//		} catch (Throwable pageNavigationError) {
//			System.out.println("Website is Down");
//			SendSMSAdmin1 Sp6 = new SendSMSAdmin1();
//			Sp6.FailSMS();
//
//		}
//
//	}
	  
//	@Test(priority = 8)
//	public void AdminIpTwo() throws IOException, NexmoClientException {
//		String expectedTitle8 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
//		String expectedUrl8 = "http://188.166.90.227/";
//		driver.get(expectedUrl8);
//		try {
//			Assert.assertEquals(expectedTitle8, driver.getTitle());
//			System.out.println("Website is up");
//		} catch (Throwable pageNavigationError) {
//			System.out.println("Website is Down");
//			SendSMSAdmin2 Sp7 = new SendSMSAdmin2();
//			Sp7.FailSMS();
//
//		}
//
//	}
	 
	    @Test(priority = 7)	
	    public void LBIpOne() throws IOException, NexmoClientException {
	    	String expectedTitle9 = "The Luxury Closet | Online Shopping Shoes, Bags & Watches for Men & Women";
	    	String expectedUrl9 = "http://188.166.77.29/";
	    	driver.get(expectedUrl9);  
	    	try{
	    		  Assert.assertEquals(expectedTitle9, driver.getTitle());
	    		  System.out.println("188.166.77.29 is up");
	    		}
	    		catch(Throwable pageNavigationError){
	    		  System.out.println("188.166.77.29 is Down");
	    		  SendSMSLB1 Sp8 = new SendSMSLB1();
					Sp8.FailSMS();
					
	    		}
	    	
		}

	
	@Test(priority = 8)
	public void LBIptwo() throws IOException, NexmoClientException {
		String expectedTitle10 = "Page Title";
		String expectedTitle10_1 = "Welcome to nginx!";
		String expectedUrl10 = "http://178.128.138.184/";
		driver.get(expectedUrl10);
		java.util.List<WebElement> myElementList1 = driver.findElements(By.xpath("//h1[contains(text(),'Welcome to nginx!')]"));
		java.util.List<WebElement> myElementList2 = driver.findElements(By.xpath("//h1[contains(text(),'This is a Heading')]"));
    	if ((myElementList1.isEmpty()) & myElementList2.isEmpty())
    	{
    		
    		System.out.println("LB 178.128.138.184 Down");
    		 SendSMSCDN Sp10 = new SendSMSCDN();
				Sp10.FailSMS();
    	}
    	else
    	{
    		System.out.println("LB 178.128.138.184 is UP");
    	}
	 
	 }
	 
	    @Test(priority = 9)	
	    public void CDNIP() throws IOException, NexmoClientException, InterruptedException {
	    	String expectedTitle11 = "TLC_EN.png (772×120)";
	    	String expectedUrl11 = "http://cdn.theluxurycloset.com/themes/gucci/images/TLC_EN.png";
	    	driver.get(expectedUrl11);
	    	//driver.findElement(By.xpath("//html//body//img"));
	    	
	    	java.util.List<WebElement> myElementList = driver.findElements(By.xpath("//html//body//img"));
	    	if (myElementList.isEmpty())
	    	{
	    		System.out.println("CDN is Down");
	    		 SendSMSCDN Sp10 = new SendSMSCDN();
					Sp10.FailSMS();
	    	}
	    	else
	    	{
	    		System.out.println("CDN is UP");
	    	}
	    	
	    	
	    	
	    	
	    	
		}
	    
	    
	    @Test(priority = 10)
		public void ES1() throws IOException, NexmoClientException {
			String expectedUrl10 = "http://uat2.theluxurycloset.com/sssp/es.php?ESSV=ES1";
			driver.get(expectedUrl10);
			String bodyText = driver.findElement(By.tagName("body")).getText();

			try {
				Assert.assertTrue(bodyText.contains("max_score"));
				System.out.println("ES1 is up");
			} catch (Throwable pageNavigationError) {
				System.out.println("ES1 is Down");
				SendSMSES1 Sp10 = new SendSMSES1();
				Sp10.FailSMS();

			}

		}

			@Test(priority = 11)
			public void ES2() throws IOException, NexmoClientException {
				String expectedUrl10 = "http://uat2.theluxurycloset.com/sssp/es.php?ESSV=ES2";
				driver.get(expectedUrl10);
				String bodyText = driver.findElement(By.tagName("body")).getText();

				try {
					Assert.assertTrue(bodyText.contains("max_score"));
					System.out.println("ES2 is up");
				} catch (Throwable pageNavigationError) {
					System.out.println("ES2 is Down");
					SendSMSES2 Sp11 = new SendSMSES2();
					Sp11.FailSMS();

				}

			}
			@Test(priority = 12)
			public void ES3() throws IOException, NexmoClientException {
				String expectedUrl10 = "http://uat2.theluxurycloset.com/sssp/es.php?ESSV=ES3";
				driver.get(expectedUrl10);
				String bodyText = driver.findElement(By.tagName("body")).getText();

				try {
					Assert.assertTrue(bodyText.contains("max_score"));
					System.out.println("ES3 is up");
				} catch (Throwable pageNavigationError) {
					System.out.println("ES3 is Down");
					SendSMSES3 Sp12 = new SendSMSES3();
					Sp12.FailSMS();

				}

			}
			@Test(priority = 13)
			public void ES4() throws IOException, NexmoClientException {
				String expectedUrl10 = "http://uat2.theluxurycloset.com/sssp/es.php?ESSV=ES4";
				driver.get(expectedUrl10);
				String bodyText = driver.findElement(By.tagName("body")).getText();

				try {
					Assert.assertTrue(bodyText.contains("max_score"));
					System.out.println("ES4 is up");
				} catch (Throwable pageNavigationError) {
					System.out.println("ES4 is Down");
					SendSMSES4 Sp13 = new SendSMSES4();
					Sp13.FailSMS();

				}

			}
			@Test(priority = 14)
			public void ES5() throws IOException, NexmoClientException {
				String expectedUrl10 = "http://uat2.theluxurycloset.com/sssp/es.php?ESSV=ES5";
				driver.get(expectedUrl10);
				String bodyText = driver.findElement(By.tagName("body")).getText();

				try {
					Assert.assertTrue(bodyText.contains("max_score"));
					System.out.println("ES5 is up");
				} catch (Throwable pageNavigationError) {
					System.out.println("ES5 is Down");
					SendSMSES5 Sp14 = new SendSMSES5();
					Sp14.FailSMS();

				}
			}


	   
	    
			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}	

}