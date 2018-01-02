package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WhatsNew {
	
	WebDriver driver;

	@Given("^user Open Browser$")
	public void user_Open_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com");
	  
	}

	@Given("^user click Header Navigation Top$")
	public void user_click_Header_Navigation_Top() throws Throwable {
		driver.findElement(By.linkText("Top")).click();
	 
	}

	@When("^user click What's New$")
	public void user_click_What_s_New() throws Throwable {
	
		driver.findElement(By.linkText("What's New?")).click();
	}

	@Then("^user can see all new products$")
	public void user_can_see_all_new_products() throws Throwable {
		driver.findElement(By.linkText("Samsung Galaxy Tab")).click();
	   
	}


}
