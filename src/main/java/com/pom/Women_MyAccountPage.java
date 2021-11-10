package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_MyAccountPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[@title='T-shirts'][1]")
	private WebElement tshirt;

	public Women_MyAccountPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}
	
	
}
