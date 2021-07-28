package com.webdrivers;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigate {
	
	@Test

	public void Script1() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;
		d1 = new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d1.get("http://www.leafground.com/pages/Window.html");
		
		d1.navigate().back();
		
		d1.navigate().forward();
		
		d1.navigate().refresh();
		
		d1.navigate().to("https://mvnrepository.com/artifact/org.testng/testng/7.4.0");
		
		
		d1.manage().window().maximize();
		
		Dimension dim = new Dimension(250, 350);
		
		d1. manage().window().setSize(dim);
		
		
		
	}

}
