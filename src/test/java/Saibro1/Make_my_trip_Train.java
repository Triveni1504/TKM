package Saibro1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Make_my_trip_Train {
 
	@Test
	public void bus() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Secunderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@role='option']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("vijayawada");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='BZA']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='May 2024'])[2]/../following-sibling::div[2]/div[3]//div[.='13']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@for='travelClass']")).click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//li[.='Sleeper Class']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Search']")).click();
		Thread.sleep(1000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200);");
		Thread.sleep(2000);
		driver.close();
	}
}