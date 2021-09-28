package com.AmazonShopping.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class AmazonHomePage {
	public WebDriver driver;
	@FindBy(id="inputValEnter")
	private WebElement searchBar;
   @FindBy(xpath="//span[@class=\"searchTextSpan\"]")
    private WebElement searchButton;
	@FindBy(xpath="//div[@class=\"sort-drop clearfix\"]")
	private WebElement SortbyList;
	@FindBy (xpath="(//li[@class=\"search-li\"])")
	private List<WebElement> SortdropListbar;
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void searchBarMethod(String object) {
		searchBar.sendKeys(object);
		searchButton.click();
		}
	public void SortbyListMethod() {
		SortbyList.click();
		for(int i=0;i<SortdropListbar.size();i++) {
			if(SortdropListbar.get(i).getText().contains("Price Low To High")){
				
				SortdropListbar.get(i).click();
				break;
			}
		}
	}

}
