package dropDwonList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmericanAirlines {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.americanairlines.in");
		 WebElement droplist=driver.findElement(By.name("adults"));
			
			  Select scl=new Select(droplist); 
			  scl.selectByValue("4"); 
			 // WebElement droplist2=driver.findElement(By.name("children")); Select scl2=new
			//  Select(droplist2); scl2.selectByValue("2");
			  
			 
	}

}
