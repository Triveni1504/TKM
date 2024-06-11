package Saibro1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Goldsika {

	@Test
	public void gold() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://goldsikka.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("sai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='email'])[1]"))
		.sendKeys("saichitturi9@gamil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]"))
		.sendKeys("9381220640");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter City']"))
		.sendKeys("Lingala");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter State']"))
		.sendKeys("Andhra Pradesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Description*']"))
		.sendKeys("I am Stay Here");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\"+"m.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void about() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://goldsikka.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
}
