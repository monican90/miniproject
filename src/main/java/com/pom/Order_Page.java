package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {

	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement summary;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement shiptick;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement shipping;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement paybywire;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirmorder;

	public Order_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	

	public WebElement getSummary() {
		return summary;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getShiptick() {
		return shiptick;
	}

	public WebElement getShipping() {
		return shipping;
	}

	public WebElement getPaybywire() {
		return paybywire;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	
	
	
	
	
	
	
}
