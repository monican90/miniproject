package com.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.Base_Class;

public class Test_Runner extends Base_Class {

	public static WebDriver driver;  // null
	public static void main(String[] args) throws Exception {

		driver = getBrowser("chrome");

		
		togetURL("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		clickOnElement(signin);

		WebElement email = driver.findElement(By.id("email"));
	
		toSendKey(email, "mytestmailtesting@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input#passwd"));
		
		toSendKey(password, "26071990mon");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		
		clickOnElement(login);

		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		moveToElement(women);
		
		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts'][1]"));
		clickOnElement(tshirt);
		
		implicitwait(5);
		
		tosleep(500);
		
		WebElement addtocart = driver.findElement(By.xpath("//span[contains(text(),'Add to')]"));
		clickOnElement(addtocart);
		
		WebElement protocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(protocheckout);
		tosleep(500);
		
		WebElement summary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(summary);
		
		WebElement address = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(address);
		
		WebElement shiptick = driver.findElement(By.xpath("//input[@id='cgv']"));
		clickOnElement(shiptick);
		
		WebElement shipping = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickOnElement(shipping);
		
		WebElement paybywire = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		clickOnElement(paybywire);
		
		WebElement confirmorder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		clickOnElement(confirmorder);
		
		screenshot();
		
	}
	

}
