package porn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	@FindBy(id="username")
	private WebElement usernameTextfield;
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement usernamePasswordTestfield;
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement keepmeloggedinCheckbox;
	@FindBy(xpath="//a[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement ForgotyourpasswordLink;
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	public ActitimeLoginPage(WebDriver driver) 
	{ 
		PageFactory.initElements(driver,this);
	}	 
	public void loginMethod() throws InterruptedException {

		usernameTextfield.sendKeys("admin");
		usernamePasswordTestfield.sendKeys("manager");
		keepmeloggedinCheckbox.click();
		loginButton.click();
		Thread.sleep(5000);
	}


}
