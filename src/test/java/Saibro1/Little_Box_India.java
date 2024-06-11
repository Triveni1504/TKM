package Saibro1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Little_Box_India {
   @Test
   public void booking() throws Exception {
	   ChromeOptions option=new ChromeOptions();
	   option.addArguments("--disable-notifications");
	   WebDriver driver=new ChromeDriver(option);
	   WebDriverManager.chromedriver().setup();
		driver.get("https://littleboxindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement ele=driver.findElement(By.xpath("//iframe[@id='popup-iframe-open']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("(//a[@class='u-close-button'])[1]")).click();  
		driver.switchTo().defaultContent();
		Thread.sleep(2000); 
		WebElement el=driver.findElement(By.xpath("(//a[@class='navigation__link'])[13]"));
		Actions act=new Actions(driver);
		act.moveToElement(el).build().perform();
		driver.findElement(By.xpath("(//a[text()='Clothing'])[2]")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);");
		driver.findElement(By.xpath("//span[.='Hide']")).click();
		driver.findElement(By.xpath("//input[@placeholder='0']")).sendKeys("1000");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1500");
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='block-inner-inner'])[1]")).click();
        jse.executeScript("window.scrollBy(0,300);");
        driver.findElement(By.xpath("//span[.='L']")).click();
        driver.findElement(By.xpath("//input[@name='PostalCode']")).sendKeys("500010");
        driver.findElement(By.xpath("//button[.='Check']")).click();
        jse.executeScript("window.scrollBy(0,200);");
        driver.findElement(By.xpath("//a[@data-quantity='up']")).click();
        driver.findElement(By.xpath("//button[.='Add to Cart']")).click();
        Thread.sleep(3000);
        WebElement e=driver.findElement(By.xpath("//div[@class='cart-summary-overlay__row-body']"));
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@class='button to-cart']")).click(); 
       // driver.findElement(By.xpath("//span[.='Cart']")).click();
        driver.findElement(By.xpath("//textarea[@name='note']")).sendKeys("Buy It");
        driver.findElement(By.xpath("//button[.='Check out']")).click();
        Thread.sleep(3000);
       // WebElement e1=driver.findElement(By.xpath("//div[@class='body svelte-154nw9j']"));
        driver.switchTo().frame(0); 
        driver.findElement(By.xpath("//button[.='Skip']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("9689898989");
        driver.findElement(By.xpath("(//input[@name='firstName'])[1]")).sendKeys("xgfcxfgc");
        driver.findElement(By.xpath("(//input[@name='lastName'])[1]")).sendKeys("fgcgfgfh");
        driver.findElement(By.xpath("(//input[@name='company'])[1]")).sendKeys("hjcvdvcchj");
        driver.findElement(By.xpath("(//input[@name='address1'])[1]")).sendKeys("bvbjkjdn564");
        driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("//input[@placeholder='PIN code']")).sendKeys("500010");
        driver.findElement(By.xpath("(//input[@name='phone'])[2]")).sendKeys("8978787889");
        jse.executeScript("window.scrollBy(0,300);");
        driver.findElement(By.xpath("//p[.='Cash on delivery']")).click();
        jse.executeScript("window.scrollBy(0,500);");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        
   }
   }