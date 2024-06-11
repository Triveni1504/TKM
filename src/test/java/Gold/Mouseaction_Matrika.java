package Gold;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Mouseaction_Matrika {
	
	@Test
	public void MouseactionsMatrika() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+"Actions.png");
		Files.copy(src, dest);
		Thread.sleep(3000);
		driver.close();
		}

}
