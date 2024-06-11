package Xyug;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {
	
    @Test
    public void calender() throws Exception {
    	WebDriver driver=new ChromeDriver();
    	
    
	Calendar cal=Calendar.getInstance();
    //  cal.add(Calendor.DAY-OF-YEAR,1);
  	  java.util.Date d=cal.getTime();
  	  SimpleDateFormat sdf=new SimpleDateFormat("MM/DD/YYYY");
  	  String datem= sdf.format(d);
  	  driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
  	  Thread.sleep(2000);
  	  driver.manage().window().maximize();
  	  Thread.sleep(2000);
  	  driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(datem);
}
}