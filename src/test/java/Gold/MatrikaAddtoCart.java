package Gold;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MatrikaAddtoCart {
	
	@Test
	public void AddToCart() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://matrika.gold/"); 
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
		element.click();
		Thread.sleep(3000);
		
		//visibletext Syntax
		Select s = new Select(element);
		s.selectByVisibleText("Earrings");
		Thread.sleep(2000);
		
		//dropdown closing
		try {
			WebElement Earrings=driver.findElement(By.xpath("(//option[text()='Earrings'])[1]"));
			Thread.sleep(3000);
			if(Earrings.isDisplayed())
			{
				Earrings.click();
			}
		}
			catch(Exception e)
			{ 
				Thread.sleep(3000);
			}
			finally
			{
				element.click();
			}
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='goldd1-img'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='addto-cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='phonenumber']")).sendKeys("7760362429");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("123456");
        
        //Screenshot Taking
        TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+"Addcart.png");
		Files.copy(src, dest);
        
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("6");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("9");
		Thread.sleep(2000);
		driver.close();
	}

}
