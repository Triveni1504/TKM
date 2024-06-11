package Saibro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseactions {
 
       @Test	
	public void mouse() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
		
		//h2[text()=' Bangles ']
	}
}