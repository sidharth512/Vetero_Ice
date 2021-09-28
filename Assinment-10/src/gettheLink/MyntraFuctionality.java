package gettheLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraFuctionality {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.myntra.com");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[.='Men']")).click();
         // driver.findElement(By.xpath("(//div[contains(@style,\"-webkit\")])[41]")).click();
 WebElement user=driver.findElement(By.xpath("//a[contains(@href,'/shirts')]"));
 user.click();
driver.findElement(By.xpath("//div[@class=\"brand-more\"]")).click();

//Thread.sleep(3000);
//  List<WebElement> Cheakbox=driver.findElements(By.xpath( "//span[.='Brand']/..//div[contains(@class,\"brand-more\")]"));
 // System.out.println(Cheakbox.size());
  
 //  Thread.sleep(3000);
 // for (int i=0;i<Cheakbox.size();i++) {
//	 if(Cheakbox.get(i).getText().contains("Allen Solly")){
	//	 System.out.println(Cheakbox.get(i).getText());
	//  Cheakbox.get(i).click();
		  //System.out.println(Cheakbox.get(i).getText());
//	  }
  }
  
 

	}


