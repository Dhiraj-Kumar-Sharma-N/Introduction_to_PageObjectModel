package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffMailLoginPage1 {

	WebDriver driver;
	
	//   DEFAULT CONSTRUCTOR  (Whenever an obj of this class is created 1st Default constructor is called)
	
	public RediffMailLoginPage1(WebDriver driver ) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="login1")
WebElement UserName;


@FindBy(xpath="//input[@id='password']")
WebElement Password;


@FindBy(xpath="//input[@title='Sign in']")
WebElement GoBtn;

@FindBy(linkText="Home")
WebElement HomeLink;


public WebElement UserNameWebElement() {
		
		return UserName;
	}
	
public WebElement PasswordWebElement() {
		
		return Password;
	}

public WebElement GoBtnWebElement() {
	
	return GoBtn;
}

public WebElement HomeLinkWebElement() {
	
	return HomeLink;
}
}




