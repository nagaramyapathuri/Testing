package com.webdrivers;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orderdlist {
	
	@Test
	
	public void Script1() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver d1;
		
		d1 = new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.get("http://demo.automationtesting.in/Selectable.html");
		d1.findElement(By.xpath("//a[@href=\"#Serialize\"]")).click();
			
		List<WebElement> ele1 = d1.findElements(By.xpath("//ul[@class=\"SerializeFunc\"]/li"));
		
		int size = d1.findElements(By.xpath("//ul[@class=\"SerializeFunc\"]/li")).size();
		System.out.println(size);
		
		Actions act1 = new Actions(d1);
		act1.keyDown(Keys.CONTROL).click(ele1.get(0)).click(ele1.get(2)).click(ele1.get(4)).click(ele1.get(6)).build().perform();
				
	}

}
