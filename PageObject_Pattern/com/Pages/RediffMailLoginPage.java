package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffMailLoginPage {

	WebDriver driver;
	
	//   DEFAULT CONSTRUCTOR  (Whenever an obj of this class is created 1st Default constructor is called)
	
	public RediffMailLoginPage(WebDriver driver ) {
		
		this.driver =driver;
	}
	
	By UserName = By.id("login1");
	By Password = By.xpath("//input[@id='password']");
	By GoBtn = By.xpath("//input[@title='Sign in']");
	By HomeLink = By.linkText("Home");
	
public WebElement UserNameWebElement() {
		
		return driver.findElement(UserName);
	}
	
public WebElement PasswordWebElement() {
		
		return driver.findElement(Password);
	}

public WebElement GoBtnWebElement() {
	
	return driver.findElement(GoBtn);
}

public WebElement HomeLinkWebElement() {
	
	return driver.findElement(HomeLink);
}
}




