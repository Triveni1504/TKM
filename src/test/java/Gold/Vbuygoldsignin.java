package Gold;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Vbuygoldsignin {
	
	@Test
	public void Signin() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vbuygold.com/");
		driver.findElement(By.xpath("//img[@routerlink='/login-type']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Signup']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7760362429");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Continue ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("6");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("9");
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+"VBuySignin.png");
		Files.copy(src, dest);
        Thread.sleep(2000);
		//Navigation n =driver.navigate();
		//n.back();
		driver.close();
	
	}

}
