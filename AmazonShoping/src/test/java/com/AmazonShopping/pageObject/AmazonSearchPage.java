package com.AmazonShopping.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage {
	
	@FindBy(xpath="//section[@data-dpidt=\"pdt_grd\"]")
	private List<WebElement> mobilesection;
	
	public AmazonSearchPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void AmazonSearchpageMethod() {
		for(int i=0;i< mobilesection.size();i++) {
			 mobilesection.get(2).click();
			
		}
		
		
	}

}
