package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Add to')]")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement protocheckout;

	public Tshirt_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getProtocheckout() {
		return protocheckout;
	}
	
	
	
}
