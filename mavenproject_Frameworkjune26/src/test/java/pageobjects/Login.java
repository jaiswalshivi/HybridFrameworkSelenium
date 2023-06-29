package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver Idriver;
	
//Need to look for more understanding for this constructor with arguments
	public Login(WebDriver rdriver){
		
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	public void enetrusername(String uame) {
		txtUsername.sendKeys(uame);
	}
	public void enterpass(String pwd) {
		
		pass.sendKeys(pwd);
	
	}
	
	public void loginbutton() {
		btnlogin.click();
	}
	
	
	

}
