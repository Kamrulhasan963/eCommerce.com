package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObJect.LoginPageObject;

public class UserLoginLogout {
	
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com");
	    
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
		 LoginPageObject m= new LoginPageObject(driver);
		 m.clickMyAccount().click();
		
		
		//driver.findElement(By.linkText("My Account")).click();   
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("email_address")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
	   
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();	
	    
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
		
	    
	}

	@Then("^user click on Log off Button for logout$")
	public void user_click_on_Log_off_Button_for_logout() throws Throwable {
	   

}}