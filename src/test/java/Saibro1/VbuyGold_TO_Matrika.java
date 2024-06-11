package Saibro1;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class VbuyGold_TO_Matrika {

	@Test
	public void vbuy() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://vbuygold.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("(//div[@class='profile'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Continue with Phone ']")).click();
		driver.findElement(By.xpath("//p[.=' Forgot Password? ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9381220640");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Navigation n=driver.navigate();
		n.back();// not executed
		n.back();
		n.back();
		driver.get("https://matrika.gold/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1900);");
		driver.findElement(By.xpath("//button[.='View All Products']")).click();
		jse.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("(//img[@class='goldd1-img'])[3]")).click();
		jse.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("//button[.='View']")).click();
		Thread.sleep(1000);
		Alert alt=driver.switchTo().alert();
		driver.findElement(By.xpath("(//button[@class='btn-close'])[4]")).click();
	}
}
