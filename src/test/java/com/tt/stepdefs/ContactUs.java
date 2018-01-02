package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs {
	
	WebDriver driver;
	
	@Given("^user Open Browser at Oscommerce$")
	public void user_Open_Browser_at_Oscommerce() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com");
	   
	}

	@Given("^user click on Top$")
	//public void user_click_on_Top() throws Throwable {

	    
	@When("^user click contact Us$")
	public void user_click_contact_Us() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")).click();	    
	}

	@When("^User Fillup \"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Fillup_and_and(String arg1, String arg2, String arg3) throws Throwable {

		driver.findElement(By.name("name")).sendKeys(arg1);
		driver.findElement(By.name("email")).sendKeys(arg2);
		driver.findElement(By.name("enquiry")).sendKeys(arg3);
	}

	@Then("^User Click Continiue$")
	public void user_Click_Continue() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
		}

	@Then("^User will get User sucessfully send quiry$")
	public void user_will_get_User_sucessfully_send_quiry() throws Throwable {
	   
	}


}
