package porn;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	public WebDriver driver;
	@FindBy(xpath=("(//input[@placeholder=\"Enter Customer Name\"])[2]"))
	private WebElement customerNameTextfield ;
	@FindBy(xpath=("//textarea[@placeholder=\"Enter Customer Description\"]"))
	private WebElement CustomerDescriptionTextfield ;
	@FindBy(xpath=("(//div[contains(@class,\"dropdownButton\")])[15]"))
	private WebElement dropdownButtonofproject;
	@FindBy(xpath=("//div[@class=\"itemRow cpItemRow \"]"))
	private List<WebElement> Projectsofthecustmor;
	@FindBy(xpath=("//div[.='Create Customer']"))
     private WebElement CreateCustomerBotton ;
	
	public CustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void CustomerPagemethod() throws InterruptedException {
		
		customerNameTextfield.sendKeys("samira");	
		CustomerDescriptionTextfield.sendKeys("good at work");
		dropdownButtonofproject.click();
		Thread.sleep(4000);
		for(int i=0;i<Projectsofthecustmor.size();i++) 
		{
	    	   if(Projectsofthecustmor.get(i).getText().equalsIgnoreCase("Our company"))
	    	   {
	    		   Projectsofthecustmor.get(i).click();break;
	    		
	    		   
	    	  }
		
	}
		
		CreateCustomerBotton.click();
		
	//Alert act=driver.switchTo().alert();
	//act.accept();
	}
}
