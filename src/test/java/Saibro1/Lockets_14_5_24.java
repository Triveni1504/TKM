package Saibro1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lockets_14_5_24 {

	@Test
	public void clicklockets() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[.=' Lockets ']")).click();
		//driver.findElement(By.xpath("(//a[@class='nav-link ng-star-inserted'])[5]")).click();
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
		jse.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("(//div[@class='cart-2'])[1]")).click();
		Thread.sleep(1000);
		//jse.executeScript("window.scrollBy(0,250);");
		driver.findElement(By.xpath("//a[.='Buy Now']")).click();
		Thread.sleep(2000);
	    //driver.close();
	}
}
