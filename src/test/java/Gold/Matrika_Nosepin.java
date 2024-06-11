package Gold;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Matrika_Nosepin {
	
	@Test
	public void Nosepin() throws Exception {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://matrika.gold/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//h2[text()=' Nose Pins ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()=' Stone Nose Pin  ']")).click();
		Thread.sleep(3000); 		
		JavascriptExecutor
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400);");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='goldd1-img'])[1]")).click();
	    jse.executeScript("window.scrollBy(0,-300);");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Buy Now']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@placeholder=\"Enter Mobile Number\"])[2]")).sendKeys("7760362429");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("123456");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("123456");
	    Thread.sleep(2000);
	    TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+"Nosepin.png");
		Files.copy(src, dest);
	    driver.close(); 
	}

}
