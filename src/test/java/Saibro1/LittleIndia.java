package Saibro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LittleIndia {
   
	@Test
	public void little() throws Exception {
		ChromeOptions option=new ChromeOptions();
		   option.addArguments("--disable-notifications");
		   WebDriver driver=new ChromeDriver(option);
			driver.get("https://littleboxindia.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    WebElement ele=driver.findElement(By.xpath("//iframe[@id='popup-iframe-open']"));
			driver.switchTo().frame(ele);
			driver.findElement(By.xpath("(//a[@class='u-close-button'])[1]")).click();  
			driver.switchTo().defaultContent();
		  /*  driver.findElement(By.xpath("//span[.='Account']")).click();
		    driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("9998885554");
		    driver.findElement(By.xpath("(//button[.='Get OTP'])[2]")).click();
		    driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("1234");
		    driver.findElement(By.xpath("(//button[.='Submit OTP'])[2]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[.='Track Order without log in']")).click(); */
			driver.findElement(By.xpath("(//span[.='Search'])[2]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("T shirts");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//span[.='Hide']")).click();
			Thread.sleep(2000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1600);");
			driver.findElement(By.xpath("//span[.='Clothing']")).click();
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,1000);");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='XL']")).click();
			WebElement left=driver.findElement(By.xpath("//div[@aria-valuenow='0']"));
			WebElement right=driver.findElement(By.xpath("//div[@aria-valuenow='2699']"));
			Actions act=new Actions(driver);
			act.dragAndDropBy(left, 30,0).perform();
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0,300);");
			act.dragAndDropBy(right, -75, 0).perform();
	}
}
