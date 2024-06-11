package Gold;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class VbuygoldTrustee {
	
	@Test
	public void Trustee() throws  Exception {
    Robot r=new Robot();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vbuygold.com/trustee-register"); 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='valuer_icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='/trustee-register']")).click();
		Thread.sleep(1000);
		
		//Personal Information
		driver.findElement(By.xpath("//input[@formcontrolname='MobileNumber']")).sendKeys("7760362429");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kmtriveni15@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Triveni K M");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='PinCode']")).sendKeys("577535");
		Thread.sleep(1000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200);");
		driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).sendKeys("Molakalmuru");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@formcontrolname='State']")).sendKeys("Karnataka");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//textarea[@formcontrolname='Landmark']")).sendKeys("L.B. Road,Chikkpete, MLK, Chitradurga");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//option[text()='Select Day']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//option[text()='Sunday']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@formcontrolname='Shop_open_time']")).sendKeys("10:30");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@formcontrolname='Shop_closed_time']")).sendKeys("5:30");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@formcontrolname='termsAndConditions']")).click();
	    Thread.sleep(1000);
	    JavascriptExecutor jse1 =(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,80);");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save & Continue ']")).click();
		Thread.sleep(1000);
		
		//Experience
		JavascriptExecutor jse11 =(JavascriptExecutor)driver;
		jse11.executeScript("window.scrollBy(0,-250);");
	    driver.findElement(By.xpath("//select[@formcontrolname='experience']")).sendKeys("3 years");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@formcontrolname='shop_name']")).sendKeys("X-YUG");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//textarea[@formcontrolname='shop_address']")).sendKeys("Prakash nagar,begumoet");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    Thread.sleep(1000);
	    
	    //Bank details
	    driver.findElement(By.xpath("//input[@formcontrolname='bank_ifsc']")).sendKeys("SBIN7441441");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@formcontrolname='account_holdername']")).sendKeys("Triveni");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@formcontrolname='bank_accountnumber']")).sendKeys("7262428208797");
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    //r.keyPress(KeyEvent.VK_PAGE_UP);
	     
	    WebElement ele= driver.findElement(By.xpath("//input[@formcontrolname='bank_document']"));
	    ele.sendKeys("C:\\Users\\Triveni K M\\Pictures\\Screenshots\\Screenshot (364).png");
	    //  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    //  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    WebElement ele1=driver.findElement(By.xpath("//input[@formcontrolname='identification_documents']"));
	    ele1.sendKeys("C:\\Users\\Triveni K M\\Pictures\\Screenshots\\Screenshot (366).png");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	    Thread.sleep(1000);
	    /*TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File(".\\Screenshot\\"+"Bankname.png");
	    Files.copy(src, dest);
	    Thread.sleep(1000);*/
	   
	    //onboarding dashboard
	    driver.findElement(By.xpath("//button[text()='Go to your Valuer Dashboard']")).click();
	    Thread.sleep(1000);
	    String parentid=driver.getWindowHandle();
	    Set<String> childid=driver.getWindowHandles();
	    for(String allid:childid) {
		if(!allid.equals(parentid)) {
			   driver.switchTo().window(allid);
		   }
	    }
	    Thread.sleep(2000);	   
	    driver.findElement(By.xpath("//input[@placeholder='Enter Phone number']")).sendKeys("7760362429");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    Thread.sleep(3000);
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File(".\\Screenshot\\"+"VBuyGold.png");
	    Files.copy(src, dest);
	    driver.close();
		
	}

}
