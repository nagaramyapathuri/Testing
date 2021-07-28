package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radiobutton {
	
	@Test
	public void script1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;
	 d1 = new ChromeDriver();
		d1.get("http://www.leafground.com/pages/radio.html");
		
		d1.findElement(By.id("yes")).click();
		
		d1.findElement(By.name("news")).click();
		
		d1.findElement(By.xpath("//input[@value='1']")).click();
		
		d1.quit();
		
		
	}

}
