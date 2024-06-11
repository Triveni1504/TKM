package Saibro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	
   public void drop() throws Exception {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://matrika.gold/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   WebElement ele=driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
	   ele.click();
	    Select s=new Select(ele);
	   s.selectByVisibleText("Mangalasutaram");
	  Navigation n=driver.navigate();
	  n.refresh();
	  driver.close();
	   
   }
}
