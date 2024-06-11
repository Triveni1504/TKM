package Gold;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class DiffScripts {
	// matrika open and close	
	@Test
	  public void sss() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://matrika.gold/");
		driver.manage().window().maximize();
		driver.close();
	}

	//vbuygold application open and close
	@Test
	   public void abc() {
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://vbuygold.com/");
		   driver.manage().window().maximize();
		   driver.close();
		   }

	//vbuygold application open and search for jwellery text area curser click to use of action elements.
	@Test
	   public void xyz() throws Exception {
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://vbuygold.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   WebElement element=driver.findElement(By.xpath("(//input[@placeholder='Search for jewellery'])[1]"));
		   Thread.sleep(1000);
		   Actions act=new Actions(driver);
		   act.moveToElement(element).contextClick().build().perform();
		   Thread.sleep(2000);
		   driver.close();
	}

	//Vbuy gold Select city hyderabad screenshot
	   @Test
	   public void pqr() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://vbuygold.com/");
		   driver.manage().window().maximize();
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   File dest=new File(".\\Screenshot\\"+"rrr.png");
		   Files.copy(src, dest);
		   driver.findElement(By.xpath("(//option[text()='Select City'])[1]")).click();
		   driver.findElement(By.xpath("(//option[text()=' Hyderabad '])[1]")).click();
		   Thread.sleep(2000);
	       driver.close();
		   
	}

	@Test
	// VBuygold/Matrika  opens and come Back,forward,titleprint,slides moving,position from one side to onther side
	public void asd() throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.get("https://vbuygold.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://matrika.gold/");
		Thread.sleep(3000);
		//backpage
		Navigation n =driver.navigate();
		n.back();
		Thread.sleep(3000);
		//reverse 
		n.forward();
		Thread.sleep(3000);
		//url title print
		String Title=driver.getTitle();
		System.out.println(Title);
		Thread.sleep(2000);
		//one side to onthere side application moving like horizantal and vertical
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		//positon set for that side or this side above or below with horizantal and vertical 
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(20, 40);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		//maximize the application
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.close();
		}

	@Test
	// vbuygold login and taking screenshot.
	public void aaa() throws InterruptedException, Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vbuygold.com/trustee-register");
		driver.findElement(By.xpath("//img[@routerlink='/login-type']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Signup']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7760362429");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Continue ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("5");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("6");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("9");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		   File src=ts.getScreenshotAs(OutputType.FILE);
		   File dest=new File(".\\Screenshot\\"+"ttt.png");
		   Files.copy(src, dest);
		Thread.sleep(3000);
	}
		
		@Test
		//dropdown close
		public void Dropdown() throws Exception {
			WebDriver driver=new ChromeDriver();
			driver.get("https://matrika.gold/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement DrpDwn = driver.findElement(By.xpath("//select[@formcontrolname='selectedCategory']"));
			DrpDwn.click();
			Thread.sleep(3000);
			try
			{
				WebElement Necklace = driver.findElement(By.xpath("(//option[text()='Necklace'])[1]"));
				Thread.sleep(3000);
				if(Necklace.isDisplayed())
				{
					Necklace.click();
				}
			}
			catch(Exception e)
			{
				Thread.sleep(2000);
			}
			finally
			{
				DrpDwn.click();
			}
			Thread.sleep(5000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400);");
			Thread.sleep(3000);
			driver.close();
		}
			
		
	}



