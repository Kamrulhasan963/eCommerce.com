package pageObJect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.LINK_TEXT, using="My Account")WebElement cl;
	
	public WebElement clickMyAccount() {
		return cl;
	
	
	
//driver.findElement(By.linkText("My Account")).click();   
}	
	
@FindBy(how=How.LINK_TEXT, using="My Account")WebElement un;
	
	public WebElement username() {
		return un;
	
	
	
  
}	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//end class
