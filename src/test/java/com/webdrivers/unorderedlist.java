package com.webdrivers;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class unorderedlist {
	
	@Test
	
	public void Script1() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver d1;
		
		d1 = new ChromeDriver();
		
		d1.get("http://demo.automationtesting.in/AutoComplete.html");
		
		d1.findElement(By.id("searchbox")).sendKeys("A");
		
		Thread.sleep(2000);
		
		List<WebElement> ele1 =d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		int size1 = ele1.size();
		
		System.out.println(size1);
		
		for(WebElement element_value: ele1) {
			
			if(element_value.getText().equalsIgnoreCase("INDIA")) {
				
				Thread.sleep(2000);
				
				element_value.click();
				
				
				break;
				
			}
		}
		
		
		TakesScreenshot s1 = (TakesScreenshot) d1;
		
		File source=s1.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\ramya\\Desktop\\New folder (2)\\screen4.jpg");
		
		FileHandler.copy(source, destination);
	}
}
