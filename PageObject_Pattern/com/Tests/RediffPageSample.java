package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Pages.RediffMailHomePage;
import com.Pages.RediffMailLoginPage;


public class RediffPageSample {

	@Test
	
	public void SampleTest()  {
		
		System.setProperty("webdriver.chrome.driver","C:/UDEMY_Selenium/Web Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		System.out.println("Browser launched Successfully ");
		
		RediffMailLoginPage obj1 = new RediffMailLoginPage(driver);
		
		obj1.UserNameWebElement().sendKeys("Dhiraj");
		
		obj1.PasswordWebElement().sendKeys("9535802575");
		
		obj1.GoBtnWebElement().click();
		
		System.out.println(driver.getTitle());
		
		obj1.HomeLinkWebElement().click();
		
		System.out.println(driver.getTitle());
		
		RediffMailHomePage obj2 = new RediffMailHomePage(driver);
		
		obj2.SearchTabWebElement().sendKeys("Sneakers");
		
		obj2.SubmitBtnWebElement().click();
		
		System.out.println(driver.getTitle());
		
			
		System.out.println("Test is Successfully Passed");
	}
	
}

/* =================================== OUTPUT =================================
 
  [RemoteTestNG] detected TestNG version 6.11.0
Starting ChromeDriver 2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387) on port 36124
Only local connections are allowed.
Mar 25, 2019 1:28:30 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Browser launched Successfully 
Rediffmail
Rediff.com: News | Rediffmail | Stock Quotes | Shopping
Test is Successfully Passed
PASSED: SampleTest

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================


*/
