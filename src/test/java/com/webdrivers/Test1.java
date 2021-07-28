package com.webdrivers;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	
	public void script1()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("http://www.leafground.com/");
		

		d1.findElement(By.linkText("Edit")).click();
		
		WebDriverWait  var_wait = new WebDriverWait(d1, 20);
		
		var_wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		
		d1.findElement(By.id("email")).sendKeys("ramyapathuri996@gmail.com");
		
		
		d1.findElement(By.xpath("//input[@value=\"Append \"]")).clear();
		
		
		d1.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("Ramya");
		
		
		d1.findElement(By.name("username")).clear();
		
		
		d1.findElement(By.name("username")).sendKeys("pathuri");
		
		
		d1.findElement(By.xpath("//input[@value='Clear me!!'] ")).clear();
		
				
		d1.findElement(By.xpath("//input[@value='Clear me!!'] ")).sendKeys("clear");
		
		
		boolean b1 = d1.findElement(By.xpath("//input[@disabled=\"true\"]")).isDisplayed();
		System.out.println(b1);
		
		d1.close();
		
	
	}

}
