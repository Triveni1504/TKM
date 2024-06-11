package Gold;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot_VBuyGold {
	
	@Test
	
	public void ScreenshotVBuyGold() throws Exception {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://vbuygold.com/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@placeholder='Search for jewellery'])[1]")).sendKeys("Haram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[.=' Secunderabad '])[1]")).click();
		 TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(".\\Screenshot\\"+"Vbuygold.png");			
			Files.copy(src, dest);
	 

	}
   
}
