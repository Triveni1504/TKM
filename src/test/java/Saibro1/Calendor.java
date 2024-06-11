package Saibro1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calendor {
      
	      @Test
	          public void calend() throws Exception {
	    	  Calendar cal=Calendar.getInstance();
	          // cal.add(Calendor.DAY-OF-YEAR,1);
	    	  Date d=cal.getTime();
	    	  System.out.println(d);
	    	  SimpleDateFormat sd = new SimpleDateFormat("DD/MM/YYYY");
	    	  String date= sd.format(d);
	    	  WebDriver driver=new ChromeDriver();
	    	  driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	    	  Thread.sleep(2000);
	    	  driver.manage().window().maximize();
	    	  Thread.sleep(2000);
	    	  driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(date);
	      } 
}