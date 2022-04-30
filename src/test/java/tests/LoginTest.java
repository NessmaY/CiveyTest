package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;

public class LoginTest {
	
	public WebDriver driver;
	Homepage homeScreen;
	LoginPage loginScreen;
	
	@BeforeSuite
	public void startDriver()
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.navigate().to("https://civey.com");
	}
	
	@Test
	public void UserCanLoginSuccesfully()
	{
		homeScreen = new Homepage(driver);
		homeScreen.OpenLoginPage();
		loginScreen = new LoginPage(driver);
		loginScreen.login("getigoh273@pantabi.com", "test");
	}
	
	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}

}
