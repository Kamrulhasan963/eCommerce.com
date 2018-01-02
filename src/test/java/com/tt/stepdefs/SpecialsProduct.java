package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpecialsProduct {
	
	WebDriver driver;


@Given("^user Open Browser and Go to Oscommerce$")
public void user_Open_Browser_and_to_to_Oscommerce() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.oscommerce.com");
	driver.findElement(By.linkText("Top")).click();

   
}

@When("^user click Specials$")
public void user_click_Specials() throws Throwable {
	
	driver.findElement(By.name("The Matrix")).click();
   
}

@Then("^user can see all Special$")
public void user_can_see_all_Special() throws Throwable {
   
}

@Then("^user can select Specific Product$")
public void user_can_select_Specific_Product() throws Throwable {
   
}


	
}
