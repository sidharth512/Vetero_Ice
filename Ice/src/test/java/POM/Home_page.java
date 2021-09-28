package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.reactivex.rxjava3.functions.Action;

public class Home_page {
	public WebDriver driver;
	@FindBy(xpath="//a[.='Men']")
	private WebElement menbutton;
	@FindBy(xpath="//a[.='T-Shirts']")
	private WebElement shirt;
  public Home_page(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
public void MenButton() throws InterruptedException {
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveToElement(menbutton).perform();
}
public void Tshirts() {
	shirt.click();
}
}
