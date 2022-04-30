package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase{

		public LoginPage(WebDriver driver) {
		super(driver);

	}


		@FindBy(className =  "input-module_input_3zNn5 input-module_error_2cUYz")
		WebElement emailText;
		
		@FindBy(className =  "button-module_button_3vZYv button-primary-module_primary_3AHeB")
		WebElement nextButton;
		
		@FindBy (className = "input-module_input_3zNn5 input-password-module_inputWithButton_1P9Wp")
		WebElement passwordText;
		
		@FindBy(className = "button-module_button_3vZYv button-primary-module_primary_3AHeB")
		WebElement anmeldenButton;

		
		public void login(String email, String password)
		{
			setTextElementText(emailText, "getigoh273@pantabi.com");
		    clickButton(nextButton);
		    setTextElementText(passwordText, "test");
		    clickButton(anmeldenButton);
		}

}
