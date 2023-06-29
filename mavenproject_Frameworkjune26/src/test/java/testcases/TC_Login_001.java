package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Login;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		driver.get(baseurl); 
		
		Login ob=new Login(driver);
		ob.enetrusername(username);
		ob.enterpass(password);
		ob.loginbutton();
		
		if (driver.getTitle().equals(" Guru99 Bank Manager HomePage ")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	

	
	
	
}
