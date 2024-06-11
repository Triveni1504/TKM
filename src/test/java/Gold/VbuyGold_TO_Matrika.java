package Gold;


import java.awt.Robot;
import java.awt.event.KeyEvent;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//div[@class='profile'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Continue with Phone ']")).click();
		driver.findElement(By.xpath("//p[.=' Forgot Password? ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7760362429");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Navigation n=driver.navigate();
		n.back(); //not executed
		n.back();
		n.back();
		driver.get("https://matrika.gold/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1800);");
		driver.findElement(By.xpath("//button[.='View All Products']")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='goldd1-img'])[3]")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("//a[.='Buy Now']")).click();
		Thread.sleep(1000);
	}
}
