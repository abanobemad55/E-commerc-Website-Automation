package Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class AddToCardPage extends BaseClass{

	
	
	@FindBy (xpath = "//*[@id='password']")
	public WebElement PasswordTextBox;
	
	public void GetElements() {
		
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPassword(String Password) {
	    PasswordTextBox.sendKeys(Password);

		
	}
}
