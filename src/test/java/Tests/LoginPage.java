package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass{
	
	static String ValidUserName = "standard_user";
	static String ValidPassword = "secret_sauce";

	
		@FindBy (xpath = "//*[@id='user-name'][@type='text']")
		public WebElement UserNameTextBox;
		
	
		
		@FindBy(id = "login-button")
		public WebElement LoginButton;
		
 public void EnterUserName(String Name) {
		 
	 UserNameTextBox.sendKeys(Name);

	 }
	

		public void ClickOnloginButton() {
			LoginButton.click();
		}
		
		public void ClearData() {
			UserNameTextBox.clear();
		}
		
		
		public void GetElements() {
			
			PageFactory.initElements(driver, this);
		}
		
		public void Setup() {
			
			System.setProperty(
		            "webdriver.chrome.driver",
		            "C:\\Users\\HP\\Desktop\\chromedriver.exe");
			        driver = new ChromeDriver();
			       driver.manage().window().maximize();
			        driver.get("https://www.saucedemo.com/");
		}

}
