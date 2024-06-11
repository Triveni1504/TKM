package Xyug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maketriobus {
	
@Test

	public void bus() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//WebElement e = driver.findElement(By.xpath("//div[@class='description']"));
		//driver.switchTo().frame(e);
		//driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='menu_Buses']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("secunderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Secunderabad, Telangana']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Bangalore, Karnataka']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath(""));	
				}

}
