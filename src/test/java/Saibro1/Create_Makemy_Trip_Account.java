package Saibro1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Create_Makemy_Trip_Account {

	@Test
	public void account() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9381220640");	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	}	
	@Test
	public void flipkart() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele= driver.findElement(By.xpath("(//div[@class='_1ch8e_'])[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(1000);
		List<WebElement> el=driver.findElements(By.xpath("//div[@class='_1UgUYI _2eN8ye']"));
		for(WebElement all:el) {
			String name=all.getText();
			System.out.println(name);
		}
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void train() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='headerIconWrapper'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Vijayawada");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Vijayawada, Andhra Pradesh, India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='May 2024']/../"
				+ "following-sibling::div//div[text()='15']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='return']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='May']/../"
				+ "following-sibling::div//div[text()='23']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Pickup-Time']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='07  Hr']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='10  min']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='APPLY']")).click();
		
		
	/*	driver.findElement(By.xpath("//label[@for='pickupTime']/./following-sibling::div[1]/div[2]/ul/li//span[text()='09  Hr']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='pickupTime']/./following-sibling::div[1]/div[2]/ul/li//span[text()='09  Hr']/../../../"
				+ "preceding-sibling::div/following-sibling::div/ul[2]//span[text()='10  min']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='pickupTime']/./following-sibling::div[1]/div[2]/ul/li//span[text()='09  Hr']/../../../preceding-sibling::div/following-sibling::div/ul[2]//span[text()='10  min']/../"
				+ "preceding-sibling::li[2]/../following-sibling::ul/li[1]//span[text()='AM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='APPLY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Drop Time']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='dropTime']/./"
        		+ "following-sibling::div[1]/div[2]/ul[1]/li[4]//span[text()='03  Hr']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='dropTime']/./following-sibling::div[1]/div[2]/ul[1]/li[4]//span[text()='03  Hr']/../../"
        		+ "following-sibling::ul[1]/li[3]/span[text()='10  min']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='dropTime']/./following-sibling::div[1]/div[2]/ul[1]/li[4]//span[text()='03  Hr']/../../following-sibling::ul[1]/li[3]/span[text()='10  min']/../../"
        		+ "preceding-sibling::ul/following-sibling::ul[2]/li[2]//span[text()='PM']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='APPLY']")).click();
        
        */
	driver.findElement(By.xpath("//a[.='Search']")).click();
	Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,600);");
	Thread.sleep(2000);
	driver.close();
	}
	}