package com.webdrivers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class cookies {
	
	@Test(enabled=false)
	
	public void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver d1;
		
		d1 = new ChromeDriver();
		
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&/");
		
		d1.findElement(By.id("createAccountSubmit")).click();
		
		d1.findElement(By.id("ap_customer_name")).sendKeys("user name");
		
		d1.findElement(By.id("ap_password")).sendKeys("password");
		
		d1.findElement(By.id("continue")).click();
		
		File f1 = new File("C:\\Users\\ramya\\Desktop\\cookie\\cookies.data");
		
		try {
			
			f1.createNewFile();
			
			FileWriter fw1 = new FileWriter(f1);
			
			BufferedWriter bw = new BufferedWriter(fw1);
			
			for(Cookie ck:d1.manage().getCookies()) {
				
				bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getValue()+";"+ck.isSecure()+";"+ck.getExpiry()));
				
				bw.newLine();
			}
			
			bw.close();
			fw1.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	@Test
	public void getCookies()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies"+ cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName() +":"+cookie.getValue()+":"+cookie.getExpiry()+":"+cookie.getPath()+":"+cookie.isSecure()+":"+cookie.getDomain());
		}
		
	}

}
