package Gold;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MAtrikaTo_Goldsikka {
	
	@Test
	public void Goldsikka() throws AWTException, InterruptedException, IOException {
Robot r=new Robot();
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://goldsikka.com/");
		driver.get("https://matrika.gold/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//img[@class='gold-sikka-logo']")).click();
	    String parentid=driver.getWindowHandle();
		   Set<String> childid=driver.getWindowHandles();
		   for(String allid:childid) {
			if(!allid.equals(parentid)) {
				   driver.switchTo().window(allid);
			   }
		   }
		    driver.findElement(By.xpath("//a[.='Contact']")).click();
		    driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Triveni");
		    driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("kmtriveni15@gmail.com");
		    driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("7760362429");
		    driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("Hyderabad");
		    driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys("Telagana");
		    driver.findElement(By.xpath("//textarea[@placeholder='Enter Description*']")).sendKeys("Hi");
		    Thread.sleep(2000);
		    JavascriptExecutor jsee=(JavascriptExecutor)driver;
			jsee.executeScript("window.scrollBy(0,600);");
		    driver.findElement(By.xpath("//button[.='Submit']")).click();
		    TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(".\\Screenshot\\"+"Goldsikka.png");
			Files.copy(src, dest);
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parentid);
			Thread.sleep(2000);
			jsee.executeScript("window.scrollBy(0,1000);");
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
		    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//button[.='View All Products']")).click();
			jsee.executeScript("window.scrollBy(0,500);");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@class='goldd1-img'])[3]")).click();
			jsee.executeScript("window.scrollBy(0,100);");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Buy Now']")).click();
			driver.close();
	}

}
