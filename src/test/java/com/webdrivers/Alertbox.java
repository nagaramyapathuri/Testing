package com.webdrivers;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
//import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class Alertbox {
	public void Script1() throws InterruptedException, IOException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver d1;
	
	d1 = new ChromeDriver();
	
	d1.get("http://www.leafground.com/pages/Alert.html");
	
	//d1.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
	
	//String msg=d1.switchTo().alert().getText();
	
	//d1.switchTo().alert().accept();
	
	//System.out.println(msg);
	
	//Thread.sleep(2000);
	
	//confirm box
	
	//d1.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
	
	//Thread.sleep(2000);
	
	// prompt box
	
	d1.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();
	
	//Thread.sleep(2000);
	
	//Alert alert =d1.switchTo().alert();
	
	//alert.sendKeys("TestLeaf");
	
	//alert.accept();
	
	Robot robot1 = new Robot();
	
	Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
	
	Rectangle rect1 = new Rectangle(screen_size);
	
	BufferedImage source = robot1.createScreenCapture(rect1);
	
	File destination = new File("C:\\Users\\ramya\\Desktop\\New folder (2)\\screen6.jpg");
	
	ImageIO.write(source,"jpg",destination);

	
	}
	
}
