package gettheLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLink {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.myntra.com");
 List<WebElement> Link=driver.findElements(By.xpath("//a"));
 Thread.sleep(4000);
 System.out.println(Link.size());
 for(int i=0;i<Link.size();i++) {
	 System.out.println(Link.get(i).getText());
 }
    
	}
}
 
 
 
 
 
 
 
 


	

