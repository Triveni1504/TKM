package Gold;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Matrika_Manglasutram {
	
	@Test
	public void Mangalasutram() throws Exception {
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
	    driver.findElement(By.xpath("//img[@class='goldd1-img']")).click();
	    driver.findElement(By.xpath("(//img[@class='addto-cart'])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[@class='gold-sikka-logo']")).click();
	    String parentid=driver.getWindowHandle();
	    Set<String> childid=driver.getWindowHandles();
	    
	    for(String allid:childid) {
	    	if(!allid.equals(parentid)) {
	    		driver.switchTo().window(allid);
	    		}
	    }
	    jse.executeScript("window.scrollBy(0,900);");
	    Thread.sleep(3000);
	    driver.close();
	    driver.switchTo().window(parentid);
	    WebElement e=driver.findElement(By.xpath("//h2[.=' Mangalasutaram ']"));
	    act.moveToElement(e).perform();
	    driver.findElement(By.xpath("//a[.=' Black beeds ']")).click();
	    Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,400);");
	    driver.findElement(By.xpath("(//div[@class='cart-2'])[1]")).click();
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,200);");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[.='Buy Now']")).click();
        Thread.sleep(1000);
        TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+"Mangalasutram.png");
		Files.copy(src, dest);
		driver.close();
	}

}
