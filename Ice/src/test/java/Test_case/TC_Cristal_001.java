package Test_case;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import POM.Home_page;
import POM.TShirt_page;

public class TC_Cristal_001 extends Baseclass{
	@Test
	public void starting() throws InterruptedException {
		Home_page home	=new Home_page( driver);
		home.MenButton();
		home.Tshirts();
		TShirt_page cheak=new TShirt_page( driver);
		cheak.CheackBox();
		cheak.morebrand();
		cheak.brandsearch();
		cheak.crossmark();
		cheak.shortting();
		
		
		
	}

}
