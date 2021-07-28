package com.webdrivers;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkbox {
	
	@Test
	public void script1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://www.leafground.com/pages/checkbox.html");
		
		d1.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		d1.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		
	
		
		
		

	}
	
	

}
