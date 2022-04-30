package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends PageBase{

	public Homepage(WebDriver driver) {
		super(driver);

	}

	
	//@FindBy (className = "button-plain-module_button_5DxmH notifications-module_closeButton_3X-Zv")
	
	@FindBy(linkText = "/login?redirect=%2F")
	WebElement loginButton;
	
	
	
	public void OpenLoginPage() 
	{

		clickButton(loginButton);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Anmelden"));
	}
}
