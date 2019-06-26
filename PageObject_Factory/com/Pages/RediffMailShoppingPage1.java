package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffMailShoppingPage1 {

	WebDriver driver;
	
	//   DEFAULT CONSTRUCTOR  (Whenever an obj of this class is created 1st Default constructor is called)
	
	public RediffMailShoppingPage1(WebDriver driver ) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="lowprice")
WebElement lowpriceTxtBox;

@FindBy(id="highprice")
WebElement highpriceTxtBox;

@FindBy(xpath="//input[@value='Go']")
WebElement PriceRangeGoBtn;


@FindBy(xpath="//*[@id=\"discountRange_1\"]/div[1]/a[1]/i")
WebElement DiscountRadioBtn;



public WebElement SetlowpriceTxtBox() {
		
		return lowpriceTxtBox;
	}
	
public WebElement SethighpriceTxtBox() {
		
		return highpriceTxtBox;
	}

public WebElement SetpriceGoBtn() {
	
	return PriceRangeGoBtn;
}


}






