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

public class Matrika_Necklace {
	
	@Test
	public void Necklace() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://matrika.gold/"); 
		driver.manage().window().maximize(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[.=' View more ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='text-center img-container'])[8]")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Silver']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[.='Upto - ₹60000']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[.='22 Carats']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[.='Upto - 10gms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Reset Filter']")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,500);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cart-2'])[8]")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,200);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Buy Now']")).click();
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+"Necklace.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
		
	}

}
