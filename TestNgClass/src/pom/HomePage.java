package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//b[.='Leave']")
	private WebElement LeaveTextLink;
	


public HomePage(WebDriver driver) 
{ 
	PageFactory.initElements(driver,this);

}
public void leaveTextMethod() throws InterruptedException {
Thread.sleep(5000);
	LeaveTextLink.click();	
}
}