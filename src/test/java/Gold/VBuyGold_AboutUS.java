package Gold;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VBuyGold_AboutUS {
	
	@Test
	public void AboutUs() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://vbuygold.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='About Us']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,400);");
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,400);");
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,500);");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[.='Contact Us']")).click();
	    Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,400);");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[.='9160006724']")).click();
	    Thread.sleep(1000);
	    driver.close();
	}

}
