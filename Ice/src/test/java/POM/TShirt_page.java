package POM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TShirt_page {

 
	@FindBy(xpath="//div[@class=\"common-checkboxIndicator\"]")
	private WebElement checkbox;
	@FindBy(xpath="//div[@class=\"brand-more\"]")
	private WebElement MoreBrand;
	@FindBy(xpath="//div[@class=\"FilterDirectory-titleBar\"]/..//label")
	private List<WebElement> brandsearch;
	@FindBy(xpath="//span[contains(@class,\"myntraweb-sprite Filter\")]")
	private WebElement cross;
	@FindBy(xpath="//span[@class=\"product-discountedPrice\"]")
	private List<WebElement> products;
	
	public TShirt_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void CheackBox() throws InterruptedException {
		checkbox.click();
		Thread.sleep(5000);
		boolean selected =checkbox.isSelected();
		System.out.println(selected);
	}
	public void morebrand() {
		MoreBrand.click();
	}
	public void brandsearch() throws InterruptedException {
		System.out.println( brandsearch.size());
		 for(int i=0;i<brandsearch.size();i++) {
	  WebElement allysolly=  brandsearch.get(i).findElement(By.xpath("//label[contains(text(),'Allen Solly')]"));
	  allysolly.click();
	 System.out.println(allysolly.isSelected());
	WebElement burshirt=    brandsearch.get(i).findElement(By.xpath("//label[contains(text(),'Bushirt')]"));
	burshirt.click();
	System.out.println(burshirt.isSelected());
	
				 
				break; 
			 }
			 
			 }
	public void crossmark() {
		cross.click();
	}
	public void shortting() {
		ArrayList<Integer>actual=new ArrayList<>();
		for(int i=0;i<products.size();i++) {
			 String fav=products.get(i).getText();
			// System.out.println(fav);
			 String price=fav.replace("Rs","").replace(" ", "").replace(".", "");
			 // System.out.println(price);
			 int  amount=Integer.parseInt(price);
			 actual.add(amount);
			 
			
		}
		Collections.sort(actual);
		Integer lowest=actual.get(0);
		for(int i=0;i<products.size();i++) {
			 String fav=products.get(i).getText();
            String price=fav.replace("Rs","").replace(" ", "").replace(".", "");
             int  amount=Integer.parseInt(price);
             if ( lowest==amount) {
            	 products.get(i).click();
             }
	
		}
	
}
	
}	
	


