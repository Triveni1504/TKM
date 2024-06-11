package Gold;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot_matrika {
	
	@Test
	public void Screenshot() throws Exception {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://vbuygold.com/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(".\\Screenshot"+"City.png");
			Files.copy(src, dest);
	    driver.findElement(By.xpath("(//input[@placeholder='Search for jewellery'])[1]")).sendKeys("Earrings");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()='Select City'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[.=' Secunderabad '])[1]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
