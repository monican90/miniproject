package com.baseclass;

import java.awt.AWTException;
import java.util.List; // remove it and use import java.util.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Base_Class {

	public static WebDriver driver; // null
//browser launch

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Monica Vignesh\\eclipse-workspace\\Seleniumproject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;

	}

//click
	public static void clickOnElement(WebElement element) {

		element.click();
	}

//sendkey
	public static void toSendKey(WebElement element, String value) {

		element.sendKeys(value);

	}

//geturl	
	public static void togetURL(String url) {
		driver.get(url);

	}

// scroll
	public static void toscroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

//Quit
	public static void toQuit() {

		driver.quit();

	}

//close
	public void toClose() {
		driver.close();
	}

//move to element
	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

// implicit wait

	public static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

// threadsleep

	public static void tosleep(int a) throws InterruptedException {
		Thread.sleep(a);
	}

//scrollby	
	public static void scrollByElement(WebElement elements) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements);
	}

// frameIn
	public static void frameIn(WebElement element) {
		driver.switchTo().frame(element);
	}

//frameout	
	public static void framOut() {
		driver.switchTo().defaultContent();

	}

//screen shot
	public static void screenshot() throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File saveFile = new File(
				"C:\\Users\\Monica Vignesh\\eclipse-workspace\\Seleniumproject\\screenshot\\myminiproject.png");
		Files.copy(screenshotAs, saveFile);

	}

	// mon

	// alert
	public static void alertbox() {

		driver.switchTo().alert();
	}

	// Actions
	public static void rightClick(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.contextClick(ele).build().perform();
	}

	public static void click(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}

	public static void clickDouble(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.doubleClick(ele).build().perform();
	}

	// movetoelement
	public static void moveto(WebElement ele) {

		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}

	// robot
	public static void rActions(WebElement ele) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// window handles

	public static void Windowhandles(WebElement element) {
		String childid = driver.getWindowHandle();
		element.click();
		Set<String> parentid = driver.getWindowHandles();
		String y = null;
		for (String d : parentid) {
			if (!d.equals(childid)) {
				y = d;
			}
		}
		driver.switchTo().window(y);

	}

	String windowHandle = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> list = new ArrayList<String>(windowHandles);

//		public static void tohandlewindo() {
//			// TODO Auto-generated method stub
//
//		}

	// checkbox
	public static void check(WebElement ele) {

		ele.click();
	}

}
