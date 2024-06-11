package Saibro1;

import java.io.File;
import java.time.Duration;
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

public class VbuyGold_Trustee {
 
	@Test
	 public void Trustee() throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://vbuygold.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.findElement(By.xpath("(//option[.='Trustee'])[1]")).click();		 
         driver.findElement(By.xpath("//input[@formcontrolname='MobileNumber']")).sendKeys("9638527419");
         driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bvhhj@gmail.com");
         driver.findElement(By.xpath("//input[@formcontrolname='NameofValuer']")).sendKeys("sai");
         driver.findElement(By.xpath("//input[@formcontrolname='PinCode']")).sendKeys("500070");
         driver.findElement(By.xpath("//textarea[@formcontrolname='Landmark']")).sendKeys("vfdvdsfv-vefevf46464");
         driver.findElement(By.xpath("//select[@formcontrolname='Shop_Closed_Day']")).click();
         driver.findElement(By.xpath("//option[.='Saturday']")).click();
         JavascriptExecutor jse=(JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,400);");
         driver.findElement(By.xpath("//input[@formcontrolname='Shop_open_time']")).sendKeys("7:30AM");	
         driver.findElement(By.xpath("//input[@formcontrolname='Shop_closed_time']")).sendKeys("8:00PM");
         jse.executeScript("window.scrollBy(0,200);");
         driver.findElement(By.xpath("//input[@type='checkbox']")).click();
         jse.executeScript("window.scrollBy(0,-400);");
         driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
         jse.executeScript("window.scrollBy(0,600);");
         driver.findElement(By.xpath("//button[.=' Save & Continue ']")).click();
         jse.executeScript("window.scrollBy(0,-300);");
         driver.findElement(By.xpath("//select[@formcontrolname='experience']")).sendKeys("2");
         driver.findElement(By.xpath("//input[@formcontrolname='shop_name']")).sendKeys("jkvnj");
         driver.findElement(By.xpath("//textarea[@formcontrolname='shop_address']")).sendKeys("hbjvbbdhvjsdhb446");
         driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
         driver.findElement(By.xpath("//input[@formcontrolname='bank_ifsc']")).sendKeys("123456789");
         driver.findElement(By.xpath("//input[@formcontrolname='account_holdername']")).sendKeys("Ch Sai Kumar");
         driver.findElement(By.xpath("//input[@formcontrolname='bank_accountnumber']")).sendKeys("229710100077805");
         WebElement ele=driver.findElement(By.xpath("//input[@formcontrolname='bank_document']"));
         ele.sendKeys("C:\\\\Users\\\\Triveni K M\\\\Pictures\\\\Screenshots\\\\Screenshot (364).png");
         WebElement ele1=driver.findElement(By.xpath("//input[@formcontrolname='identification_documents']"));
         ele1.sendKeys("C:\\Users\\Triveni K M\\Pictures\\Screenshots\\Screenshot (366).png");
         driver.findElement(By.xpath("//button[.=' Save ']")).click();
         driver.findElement(By.xpath("//button[.='Go to your Valuer Dashboard']")).click();
         String parentid=driver.getWindowHandle();
         Set<String> childid=driver.getWindowHandles();
         for(String allid:childid) {
        	 if(!allid.equals(parentid)) {
        		 driver.switchTo().window(allid);
        	 }
         }
         driver.findElement(By.xpath("//input[@placeholder='Enter Phone number']")).sendKeys("1234567899");
         driver.findElement(By.xpath("//button[.='Continue']")).click();
	     driver.close();
	     driver.switchTo().window(parentid);
	     driver.findElement(By.xpath("//a[.='Rings']")).click();
	     driver.findElement(By.xpath("//div[@class='cardimage']")).click();
	     jse.executeScript("window.scrollBy(0,200);");
	     driver.findElement(By.xpath("//button[.=' Make Offer ']")).click();
	     driver.findElement(By.xpath("//input[@placeholder='Continue with Phone ']")).click();
	     driver.findElement(By.xpath("//p[.=' Forgot Password? ']")).click();
	     driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
	     driver.findElement(By.xpath("//button[.='Continue']")).click();
	     TakesScreenshot ts=(TakesScreenshot)driver;
         File src=ts.getScreenshotAs(OutputType.FILE);
         File dest=new File(".\\Screenshot\\"+"abc.png");
         Files.copy(src, dest);
         Thread.sleep(2000);
         driver.close();
	}
}
