package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseurl="https://demo.guru99.com/V4/index.php";
    public 	String username="mngr26593";
	public String password="1234567@";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	}
	
