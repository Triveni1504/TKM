package Xyug;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Redbus {
	
	@Test
	public void Bus() throws Exception {
		//Robot r=new Robot();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.redbus.com/"); 
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Okay']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='date input-box ']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='next']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 xaHaF'])[21]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='returndate input-box ']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 xaHaF'])[22]")).click();	
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='SEARCH']")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		try 
	    {
	    	WebElement close = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
	    	if(close.isDisplayed())
	    	{
	    		close.click();
	    	}
	    	
//	    	wait.until(ExpectedConditions.elementToBeClickable(close));
	    } 
	    catch (Exception e)
	    {
	    	Thread.sleep(1000);
	    }
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100);");
		Thread.sleep(1000);
	    WebElement BusType = driver.findElement(By.xpath("//div[.='BUS TYPES']"));
	    wait.until(ExpectedConditions.elementToBeClickable(BusType));
	    BusType.click();
		Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.xpath("//label[@title='AC']")).click();
		
		try 
		{
			WebElement close = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
			wait.until(ExpectedConditions.elementToBeClickable(close));
		} 
		catch (Exception e)
		{
			Thread.sleep(1000);
		}
		
		//driver.findElement(By.xpath("//div[@class='close-primo']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jsee=(JavascriptExecutor)driver;
	    jsee.executeScript("window.scrollBy(0,100);");
		WebElement Time = driver.findElement(By.xpath("(//label[@for='dtAfter 6 pm'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(Time));
		Time.click();
		Thread.sleep(2000);
		jsee.executeScript("window.scrollBy(0,500);");
		
		/*driver.findElement(By.xpath("//div[.='ARRIVAL TIME']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[11]")).click();
		*/
		driver.findElement(By.xpath("//div[.='BOARDING POINT']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("//label[@title='Ameerpet']")).click();
	    Thread.sleep(1000);
	    
	    try 
	    {
	    	WebElement close = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
	    	if(close.isDisplayed())
	    	{
	    		close.click();
	    	}
	    	
//	    	wait.until(ExpectedConditions.elementToBeClickable(close));
	    } 
	    catch (Exception e)
	    {
	    	Thread.sleep(1000);
	    }

		driver.findElement(By.xpath("//div[@class='button btn-apply bp-apply']")).click();
	    Thread.sleep(1000);
	   
	    driver.findElement(By.xpath("//div[.='DROPPING POINT']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		driver.findElement(By.xpath("//label[@title='Silk Board']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='button btn-apply dp-apply']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//div[.='OPERATOR']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("//label[@title='Northern Travels']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='button btn-apply op-apply']")).click();
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,300);");
	    driver.findElement(By.xpath("//div[.='View Seats']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='lower-canvas canvas-wrapper']")).click();
	    //driver.findElement(By.xpath("//canvas[@class='pointer']")).click();
	    
	    driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[15]")).click();
	    driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[33]")).click();
	    driver.findElement(By.xpath("//button[.='Proceed to book']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[.='Name']")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Triveni K M");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[.='Age']")).click();
	    driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("24");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[.='State of Residence']")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Karnataka");
	    driver.findElement(By.xpath("//li[.='Karnataka']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[.='Email ID']")).click();
	    driver.findElement(By.xpath("(//input[@class='input_box '])[3]")).sendKeys("kmtriveni15@gmail.com");
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,300);");
	    driver.findElement(By.xpath("//label[.='Phone']")).click();
	    driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("7760362429");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,400);");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='checkmark-radio'])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,600);");
	    driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//div[@class='sc-Rmtcm imNRTh'])[1]")).click();
	    Thread.sleep(1000);
	    TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   File dest=new File(".\\Screenshot\\"+"bus.png");
		   Files.copy(src, dest);
	       Thread.sleep(1000);
	    
	    
	}
}



