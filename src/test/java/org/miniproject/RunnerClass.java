package org.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RunnerClass {

	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Monica Vignesh\\eclipse-workspace\\SeleniumTasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mytestmailtesting@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input#passwd"));
		password.sendKeys("26071990mon");

		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		login.click();

		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).build().perform();

		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts'][1]"));
		tshirt.click();

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);

		WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		img.click();

		WebElement addframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(addframe);

		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		quantity.clear();
		quantity.sendKeys("4");

		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s1 = new Select(size);
		s1.selectByValue("3");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement addtocart = driver.findElement(By.xpath("//span[contains(text(),'Add to')]"));
		addtocart.click();

		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);

		WebElement protocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		protocheckout.click();

		js.executeScript("window.scrollBy(0,1000)", "");
		WebElement summary = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to')])[2]"));
		summary.click();

		js.executeScript("window.scrollBy(0,1000)", "");
		WebElement address = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		address.click();

		js.executeScript("window.scrollBy(0,1000)", "");
		WebElement shiptick = driver.findElement(By.cssSelector("input#cgv"));
		shiptick.click();

		js.executeScript("window.scrollBy(0,500)", "");
		WebElement shipping = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to ')])[2]"));
		shipping.click();

		js.executeScript("window.scrollBy(0,1000)", "");
		WebElement paybywire = driver.findElement(By.cssSelector("a.bankwire"));
		paybywire.click();

		js.executeScript("window.scrollBy(0,500)", "");
		WebElement confirmorder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		confirmorder.click();

		js.executeScript("window.scrollBy(0,300)", "");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Monica Vignesh\\eclipse-workspace\\SeleniumTasks\\screenshot\\miniproject.png");
		FileUtils.copyFile(source, destination);

		System.out.println("success");

	}

	
	
	
	
		
	
	
	
	
}
