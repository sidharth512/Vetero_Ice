package AmazoneShoping.testcases;

import org.testng.annotations.Test;

import com.AmazonShopping.pageObject.AmazonHomePage;

public class AmzoneTestcase extends AmazoneBaseClass {
	@Test
	public void Homelogin() {
		driver.get(BaseUrl);
		AmazonHomePage Link=new AmazonHomePage(driver);
		Link.searchBarMethod(sreachObject);
		Link.SortbyListMethod();
	
	}

}
