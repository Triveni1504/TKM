package Gold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Goldsikka_AboutUs {
	
	@Test
	public void AboutUs() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://goldsikka.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement dropdown=driver.findElement(By.xpath("//button[text()=' About Us']"));
		dropdown.click();
	    Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//div[@class='dropdown-content']"));
		element1.click();
		Thread.sleep(2000);
		
		
		try {
			WebElement Services=driver.findElement(By.xpath("//a[.='Privacy & Policy']"));
			Thread.sleep(3000);
			if(Services.isDisplayed())
			{
				Services.click();
			}
		}
			catch(Exception e)
			{ 
				Thread.sleep(3000);
			}
			finally
			{
				dropdown.click();
			}
		WebElement e2=driver.findElement(By.xpath("//h1[.='1. General Conditions Of Use.']"));
		Actions act=new Actions(driver);
		act.moveToElement(e2).build().perform();
		Thread.sleep(2000);
		e2.click();
	    Thread.sleep(2000);
		driver.close();
	}

}
