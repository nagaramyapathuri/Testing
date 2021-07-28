package com.webdrivers;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame {
	
	@Test
	
	public void Script1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver d1;
		
		d1 = new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/frame.html");
		
		
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d1.switchTo().frame(0);
		
		d1.findElement(By.id("Click")).click();
		
		d1.switchTo().defaultContent();
		
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		
		
		// nested frame
		
		
		 int size1= d1.findElements(By.xpath("//iframe[@src=\"page.html\"]")).size();
		
		
		 System.out.println(size1);
		 
		 d1.switchTo().defaultContent();
		 
		
		
		
		
		
		
		
	}

}
