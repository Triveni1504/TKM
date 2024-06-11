package Saibro1;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Make_my_trip {

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
		driver.findElement(By.xpath("//p[text()='Rajiv Gandhi International Airport']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='May 2024'])[2]/../following-sibling::div//p[.='30']")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-200);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		Thread.sleep(1000);
	    jse.executeScript("window.scrollBy(0,200);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='October']/../following-sibling::div//p[text()='30'])[2]")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-200);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy='adults-5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
	}
}