package Saibro1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Matrika {
 @Test
	public void matrika() throws Exception {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://matrika.gold/");
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,200);");
	    WebElement ele=driver.findElement(By.xpath("//h2[.=' Jhumka ']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//a[.=' Stones  ']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[.='TYPE']")).click();
	    driver.findElement(By.xpath("//input[@value='Gold']")).click();
	    driver.findElement(By.xpath("//button[.='PRICE']")).click();
	    driver.findElement(By.xpath("//input[@value='150000']")).click();
	    driver.findElement(By.xpath("//button[.='CARAT']")).click();
	    driver.findElement(By.xpath("//input[@value='22']")).click();
	    driver.findElement(By.xpath("//button[.='WEIGHT']")).click();
	    driver.findElement(By.xpath("//input[@value='20']")).click();
	    driver.findElement(By.xpath("//button[.='Reset Filter']")).click();
	    Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,200);");
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@class='goldd1-img']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//img[@class='addto-cart'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@class='gold-sikka-logo']")).click();
	    String parentid=driver.getWindowHandle();
	    Set<String> childid=driver.getWindowHandles();
	    
	    for(String allid:childid) {
	    	if(!allid.equals(parentid)) {
	    		driver.switchTo().window(allid);
	    		}
	    }
	    jse.executeScript("window.scrollBy(0,900);");
	    Thread.sleep(2000);
	    driver.close();
	  
	    driver.switchTo().window(parentid);
	    WebElement e=driver.findElement(By.xpath("//h2[.=' Mangalasutaram ']"));
	    act.moveToElement(e).perform();
	    driver.findElement(By.xpath("//a[.=' Black beeds ']")).click();
	    Thread.sleep(2000);
	    driver.close();
	  
	   /* Navigation n=driver.navigate();
	    n.refresh();
	    Thread.sleep(3000);
	    WebElement e=driver.findElement(By.xpath("//h2[.=' Mangalasutaram ']"));
	    act.moveToElement(e).perform();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()=' Black beeds ']")).click();
	    jse.executeScript("window.scrollBy(0,400);"); */
	}
 
 
 // Equillence balancing(or)Partining 
}
