package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	
	public void Setup() {
		
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\HP\\Desktop\\chromedriver.exe");
		        driver = new ChromeDriver();
		       driver.manage().window().maximize();
		        driver.get("https://www.saucedemo.com/");
	}


	public void Testtest(){

		
	}
	
}
