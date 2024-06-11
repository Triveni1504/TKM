package Saibro1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Vbuygold_Valuer_08_05 {
@Test
	 public void create() throws Exception {
	WebDriver driver=new ChromeDriver();
	Robot r=new Robot();
	driver.get("https://vbuygold.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//option[text()='Valuer'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9381220640");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saichitturi9@gmail.com");
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("sai Chowdary");
	driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("521402");
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	driver.findElement(By.xpath("//textarea[@formcontrolname='Landmark']")).sendKeys("3-108");
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	driver.findElement(By.xpath("//option[text()='Select Day']")).click();
	driver.findElement(By.xpath("//option[text()='Saturday']")).click();
	driver.findElement(By.xpath("//input[@formcontrolname='Shop_open_time']")).sendKeys("7:40AM");
	driver.findElement(By.xpath("(//input[@type='time'])[2]")).sendKeys("8:00PM");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()=' Save & Continue ']")).click();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-400);");
	driver.findElement(By.xpath("//select[@id='fname']")).click();
	driver.findElement(By.xpath("//option[text()='2 Years']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("sai");
	driver.findElement(By.xpath("//textarea[@formcontrolname='shop_address']"))
	.sendKeys("lingala");
	driver.findElement(By.xpath("(//button[text()=' Save '])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("12345678");
	driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("sai chowdary");
	driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("229710100077805");
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	WebElement ele= driver.findElement(By.xpath("//input[@formcontrolname='bank_document']"));
	ele.sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures\\Screenshot (34).png");
	WebElement ele1= driver.findElement(By.xpath("//input[@formcontrolname='identification_documents']"));
	ele1.sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures\\Screenshot (35).png");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Go to your Valuer Dashboard']")).click();
	String parentid=driver.getWindowHandle();
	Set<String> childid=driver.getWindowHandles();
	 for(String allid:childid) {
		if(!allid.equals(parentid)) {
			driver.switchTo().window(allid);
		}
	} 
	 driver.findElement(By.xpath("//input[@placeholder='Enter Phone number']")).sendKeys("9381220640");
	  driver.findElement(By.xpath("//button[text()='Continue']")).click();
	  Thread.sleep(200);
	  driver.quit();
	}
}
