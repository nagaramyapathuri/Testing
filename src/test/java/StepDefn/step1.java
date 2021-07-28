package StepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step1 {
	
	WebDriver d1;
	@Given("Open chrome url of the application")
	public void open_chrome_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&/");

	}
	
	@When("Enter username and password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		
d1.findElement(By.id("createAccountSubmit")).click();
		
		d1.findElement(By.id("ap_customer_name")).sendKeys("user name");
		
		d1.findElement(By.id("ap_password")).sendKeys("password");
		
		d1.findElement(By.id("continue")).click();
		
	    
	}
	
	@Then("Login to account")
	public void login_to_account() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login to account");
	}

}
