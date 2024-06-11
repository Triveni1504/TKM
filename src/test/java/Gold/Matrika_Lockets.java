package Gold;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Matrika_Lockets {
	
	@Test
	public void Lockets() throws Exception {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://matrika.gold/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//h2[.=' Lockets ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='nav-link ng-star-inserted'])[5]")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);");
		driver.findElement(By.xpath("//button[.='TYPE']")).click();
		driver.findElement(By.xpath("//input[@value='Gold']")).click();
		driver.findElement(By.xpath("//p[.='Gold']")).click();
		driver.findElement(By.xpath("//button[.='PRICE']")).click();
		driver.findElement(By.xpath("//input[@value='100000']")).click();
		driver.findElement(By.xpath("//p[.='Upto - ₹100000']")).click();
		driver.findElement(By.xpath("//button[.='CARAT']")).click();
		driver.findElement(By.xpath("//input[@value='24']")).click();
		driver.findElement(By.xpath("//p[.='24 Carats']")).click();
		driver.findElement(By.xpath("//button[.='WEIGHT']")).click();
		driver.findElement(By.xpath("//input[@value='15']")).click();
		driver.findElement(By.xpath("//p[.='Upto - 15gms']")).click();
		driver.findElement(By.xpath("//button[.='Reset Filter']")).click();
		jse.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='goldd1-img'])[7]")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,100);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Buy Now']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+"Lockets.png");
		Files.copy(src, dest);
	    driver.close();
	}

}
