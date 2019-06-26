package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffMailHomePage {

WebDriver driver;
	
	//   DEFAULT CONSTRUCTOR  (Whenever an obj of this class is created 1st Default constructor is called)
	
	public RediffMailHomePage(WebDriver driver ) {
		
		this.driver =driver;
		
	}
	
By SearchTab = By.id("srchword");
By SubmitBtn = By.className("newsrchbtn");

public WebElement SearchTabWebElement() {
	
	return driver.findElement(SearchTab);
}

public WebElement SubmitBtnWebElement() {
	
	return driver.findElement(SubmitBtn);
}
}
