package com.webdrivers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploadfile {
	
	@Test
	
	public void test() throws AWTException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver d1;
		
		d1 = new ChromeDriver();
		
		
		d1.get("https://www.ilovepdf.com/excel_to_pdf");
		
		d1.findElement(By.id("pickfiles")).click();
		
		String file1 ="C:\\Users\\ramya\\Desktop\\Excel.xsls";
		
		StringSelection select1 = new StringSelection(file1);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1,null);
		
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		
		r1.keyPress(KeyEvent.VK_V);
		
		r1.keyRelease(KeyEvent.VK_V);
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		d1.close();
		
		
		
	}
}
