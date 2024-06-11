package Xyug;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Makemytrip {
	
@Test

public void make() throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys("Hyderabad");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Hyderabad Begumpet Airport']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@data-cy='toCity']")).sendKeys("New Delhi");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[text()='Indira Gandhi International Airport']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[30]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[4]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Return']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[56]")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("(//div[text()='October']/../following-sibling::div//p[text()='30'])[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom5'])[1]")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//li[@data-cy='adults-5']")).click();
	driver.findElement(By.xpath("//p[@data-cy='adultRange']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[@data-cy='childrenRange']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[@data-cy='infantRange']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@data-cy='infants-1']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//p[@data-cy='chooseTravelClass']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@data-cy='travelClass-1']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("//a[.='Search']")).click();
    }

}
