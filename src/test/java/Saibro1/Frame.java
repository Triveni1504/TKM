package Saibro1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Frame {
    
	@Test
	public void frame() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='class-summary-tab1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Exceptions']")).click();
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshots\\"+"bca.png");
		Files.copy(src, dest);
		//driver.findElement(By.xpath("dfvsfvsdv")).click();
        driver.close();
		
	}
}
