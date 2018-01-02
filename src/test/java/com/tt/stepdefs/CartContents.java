package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartContents {
	
	WebDriver driver;
	
	@Given("^user Launch Browser$")
	public void user_Launch_Browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com");
	}

	@When("^user click CartContents$")
	public void user_click_CartContents() throws Throwable {
		driver.findElement(By.linkText("Cart Contents")).click();
	    
	}
	
	
	@Then("^user can see CartContents$")
	public void user_can_see_CartContents() throws Throwable {
	    
	}



}
