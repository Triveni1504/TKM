package Saibro1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart_print_all {

	@Test
	public void printall() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();

       WebElement ele=driver.findElement(By.xpath("(//div[@class='_3ETuFY'])[4]"));
        Thread.sleep(2000);
        Actions act=new Actions(driver);
			act.moveToElement(ele).build().perform();
			Thread.sleep(2000);    
			
		  List<WebElement> el=driver.findElements(By.xpath("//div[@class='_1UgUYI _2eN8ye']"));
		for(WebElement all:el) {
			String name=all.getText();
			System.out.println(name);
		}
		driver.close();
		
	}
}