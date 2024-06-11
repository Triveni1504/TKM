package Saibro1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VbuyGold {

	@Test
	public void vbuy() throws Exception {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		Robot r=new Robot();
		driver.get("https://vbuygold.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[text()='Select Carat']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='22k']")).click();
        Thread.sleep(2000);
        driver .findElement(By.xpath("//option[text()='Select Weight']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[text()='11 grams - 15 grams']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[text()='Select Price']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[text()='Rs.20001 - 30000']")).click();
        Thread.sleep(3000);
        driver.close();  
		driver.findElement(By.xpath("//img[@class='noisepinImg']")).click(); 
		Thread.sleep(1000);
		
		/*driver.findElement(By.xpath("(//option[text()='Valuer'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9381220640");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saichitturi9@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("sai Chowdary");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("521402");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);"); 
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//p[@class='ng-star-inserted'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		// jse.executeScript("window.scrollBy(0,300);");
		driver.findElement(By.xpath("//textarea[@formcontrolname='Landmark']")).sendKeys("3-108");
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[text()='Select Day']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Saturday']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='Shop_open_time']")).sendKeys("7:40AM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='time'])[2]")).sendKeys("8:00PM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Save & Continue ']")).click();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	//	jse.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();*/
	}
}
