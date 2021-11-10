package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class TestRunner_Pom extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Home_Page hp = new Home_Page(driver);
	public static Login_Page lp = new Login_Page(driver);
	public static Women_MyAccountPage wp = new Women_MyAccountPage(driver);
	public static Tshirt_Page tp = new Tshirt_Page(driver);
	public static Order_Page op = new Order_Page(driver);

	public static void main(String[] args) throws Exception {
		togetURL("http://automationpractice.com/index.php");

		clickOnElement(hp.getSignin());

		toSendKey(lp.getEmail(), "mytestmailtesting@gmail.com");

		toSendKey(lp.getPassword(), "26071990mon");

		clickOnElement(lp.getLogin());

		moveToElement(wp.getWomen());

		clickOnElement(wp.getTshirt());
		implicitwait(5);
		tosleep(500);

		clickOnElement(tp.getAddtocart());

		clickOnElement(tp.getProtocheckout());

		tosleep(500);

		clickOnElement(op.getSummary());

		clickOnElement(op.getAddress());

		clickOnElement(op.getShiptick());

		clickOnElement(op.getShipping());

		clickOnElement(op.getPaybywire());

		clickOnElement(op.getConfirmorder());
		screenshot();

	}

}
