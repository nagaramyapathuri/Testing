package com.webdrivers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windows {
	
	@Test
	
	public void Script1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;
		d1 = new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/Window.html");
		
		d1.findElement(By.id("home")).click();
		
		 Set<String> Window_value= d1.getWindowHandles();
		 
		 Iterator<String> iter = Window_value.iterator();
		 
		 String w1 = iter.next();
		 
		 String w2 = iter.next();
		 
		 d1.switchTo().window(w2);
		 
		 System.out.println(w1);
		 
		 System.out.println(w2);
		 
		 String title_child = d1.getTitle();
		 
		 System.out.println(title_child);
		 
		 String url =d1.getCurrentUrl();
		 
		 String sou = d1.getPageSource();
		 
		 System.out.println(url);
		 
		 System.out.println(sou);
		 
		 
		
		
	}
}
