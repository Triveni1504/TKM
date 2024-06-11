package Xyug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import ObjectRepository.Slide;

public class Flipkart {
	
	@Test
	
	public void flipkart() throws Exception, AWTException {
		
		WebDriver driver=new ChromeDriver();
    	driver.get("https://www.flipkart.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[@aria-label='Mobiles']")).click();
    	Thread.sleep(2000);
    	
    	JavascriptExecutor jse11 =(JavascriptExecutor)driver;
		jse11.executeScript("window.scrollBy(0,500);");
    	
		driver.findElement(By.xpath("//span[text()='Price']")).click();
		Thread.sleep(1000);
//		WebElement left=driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']"));
//		Thread.sleep(2000);
//		WebElement right=driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']"));
//		Thread.sleep(2000);
		
		Slide s = new Slide(driver);
		WebElement left = s.getLeft();
		WebElement right = s.getRight();
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(left, 35,0).perform();
		Thread.sleep(3000);
		Actions act1=new Actions(driver);
		act1.dragAndDropBy(right, -130,0).perform();
		Thread.sleep(3000);
		
		
		
		
		
    	//driver.close();
	}

}
