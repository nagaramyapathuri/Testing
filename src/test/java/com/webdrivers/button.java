package com.webdrivers;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class button {

	@Test

	public void script1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;
		d1 = new ChromeDriver();


		d1.get("http://www.leafground.com/");
		

		d1.findElement(By.linkText("Button")).click();
		
		
		d1.findElement(By.id("home")).click();

		d1.quit();

	}

}
