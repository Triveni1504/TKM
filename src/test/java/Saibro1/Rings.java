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

public class Rings {
   
	@Test
    	public void rrr() throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='text-center img-container'])[1]")).click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@class='goldd1-img'])[3]")).click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='buynowButton']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\"+"ddd.png");
		Files.copy(src, dest);
		Thread.sleep(3000);
		driver.close();
		
	
	}
}