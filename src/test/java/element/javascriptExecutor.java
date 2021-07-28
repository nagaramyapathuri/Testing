package element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptExecutor {
	@Test
	public void f() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver d1;
		
		d1 = new ChromeDriver();
		
		d1.get("http://demo.automationtesting.in/Datepicker.html");
		
		JavascriptExecutor jse = (JavascriptExecutor) d1;
		
		jse.executeScript("document.getElementBy('datepicker1').value = '21/07/2021'");
		
		
	}

}
