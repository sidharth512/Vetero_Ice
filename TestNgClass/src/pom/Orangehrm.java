package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrm {
	WebDriver driver;
	@FindBy(id="txtUsername")
	private WebElement usernameTextfield;
	@FindBy(id="txtPassword")
	private WebElement usernameTextPassword ;
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	public Orangehrm(WebDriver driver) 
	{ 
		PageFactory.initElements(driver,this);
	}	 
	public void loginMethod() throws InterruptedException {

		usernameTextfield.sendKeys("Admin");
		 usernameTextPassword.sendKeys("admin123");
		loginButton.click();
		
	}
}
