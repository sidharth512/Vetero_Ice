package porn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesofWorkpage {
@FindBy(xpath=("//span[.='Create Type of Work']"))
private WebElement CreateTypeofWorkButton;
@FindBy(xpath=("//input[@onclick=\"filterTypes()\"]"))
private WebElement ShowtypeofworkButton;
public TypesofWorkpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void NewTypeofWorkMehod() {
	CreateTypeofWorkButton.click();
}


}
