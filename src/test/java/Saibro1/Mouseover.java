package Saibro1;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class Mouseover {

	@Test
	public void mouse() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://vbuygold.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	}
	@Test                                                     
	public void kkk() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement DrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
		DrpDwn.click();
		Thread.sleep(3000);
		try
		{
			WebElement Necklace = driver.findElement(By.xpath("(//option[text()='Necklace'])[1]"));
			Thread.sleep(3000);
			if(Necklace.isDisplayed())
			{
				Necklace.click();
			}
		}
		catch(Exception e)
		{
			Thread.sleep(2000);
		}
		finally
		{
			DrpDwn.click();
		}
		Thread.sleep(5000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		driver.close();
	}
	@Test
public void handling() throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://matrika.gold/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
	Actions act=new Actions(driver);
	act.moveToElement(element).contextClick().build().perform();
	Thread.sleep(3000);
	driver.close();
}
	@Test
	public void screen() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\"+"ba.png");
	    com.google.common.io.Files.copy(src, dest);
	    driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']")).click();
	    Thread.sleep(3000);
	    driver.close();
	}	
	@Test
	public void back() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://vbuygold.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//option[text()='Trustee'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("sai kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("saichitturi9@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("sai chowdary");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\"+"cb.png");
		Files.copy(src, dest);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("521402");
		Thread.sleep(3000);
		driver.close();
	}@Test
	
	public void jjj() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://matrika.gold/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://vbuygold.com/");
		Thread.sleep(2000);
		Navigation n=driver.navigate();
		n.back();
		Thread.sleep(3000);
		n.forward();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		Point p=new Point(20, 400);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
}