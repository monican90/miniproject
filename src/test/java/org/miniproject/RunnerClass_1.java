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

import com.baseclass.Base_Class1;

public class RunnerClass_1 extends Base_Class1 {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = getDriver("chrome");

		getUrl("http://automationpractice.com/index.php ");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));

		clickElement(signin);

		scroll(signin);

		WebElement email = driver.findElement(By.id("email"));

		setkey(email, "mytestmailtesting@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("input#passwd"));

		setkey(password, "26071990mon");

		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));

		clickElement(login);

		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));

		sendkeysActions(women, getTitle());

		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts'][1]"));

		clickElement(tshirt);

		sleep(500);

		scroll(tshirt);

		sleep(3000);

		WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));

		clickElement(img);

		WebElement addframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));

		toframes(addframe);

		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		quantity.clear();

		setkey(quantity, "4");

		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));

		firstSelectedOp(size);

		getDriver(getCurrentUrl());
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebElement addtocart = driver.findElement(By.xpath("//span[contains(text(),'Add to')]"));

		clickElement(addtocart);

		driver.switchTo().defaultContent();
		scroll(addtocart);

		sleep(3000);

		WebElement protocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));

		clickElement(protocheckout);
		scroll(protocheckout);

		WebElement summary = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to')])[2]"));
		clickElement(summary);
		scroll(summary);

		WebElement address = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));

		clickElement(address);
		scroll(address);

		WebElement shiptick = driver.findElement(By.cssSelector("input#cgv"));

		clickElement(shiptick);
		scroll(shiptick);

		WebElement shipping = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to ')])[2]"));

		clickElement(shipping);
		scroll(shipping);

		WebElement paybywire = driver.findElement(By.cssSelector("a.bankwire"));

		clickElement(paybywire);
		scroll(paybywire);

		WebElement confirmorder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));

		clickElement(confirmorder);
		scroll(confirmorder);

		screenshot();

		System.out.println("success");

	}

}
