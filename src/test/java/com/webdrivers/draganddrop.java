package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
	
	@Test
	
	public void Script1() {
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver d1;
			
			d1 = new ChromeDriver();
			
			d1.get("http://www.leafground.com/pages/drop.html");
		
			
			d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			
			
			Actions act1 = new Actions(d1);
			
			WebElement e1 = d1.findElement(By.id("draggable"));
			
			WebElement e2 = d1.findElement(By.id("droppable"));
			
			act1.dragAndDrop(e1, e2).build().perform();
		
	}

}
