package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffMailHomePage1{

WebDriver driver;
	
	//   DEFAULT CONSTRUCTOR  (Whenever an obj of this class is created 1st Default constructor is called)
	
	public RediffMailHomePage1(WebDriver driver ) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}


@FindBy(id="srchword")
WebElement SearchTab;

@FindBy(className="newsrchbtn")
WebElement SubmitBtn;

public WebElement SearchTabWebElement() {
	
	return SearchTab;
}

public WebElement SubmitBtnWebElement() {
	
	return SubmitBtn;
}
}
