package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {
	
	@Test
	public void script1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		
		d1 = new ChromeDriver();
		d1.get("http://www.leafground.com/pages/Dropdown.html");
		Select select1=new Select(d1.findElement(By.name("dropdown2")));
		
		select1.selectByVisibleText("UFT/QTP");
		
		//Select.selectByIndex(4);
		
		//Select select1 = new Select(d1.findElement(By.name("dropdown3")));
		
		//select1.selectByValue("Appium");
		
		

		
	

	}

}
