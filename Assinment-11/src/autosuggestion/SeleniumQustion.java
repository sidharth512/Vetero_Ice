package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumQustion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.yahoo.com");
 driver.findElement(By.id("ybar-sbq")).sendKeys("selenium");
 Thread.sleep(5000);
 List<WebElement> suggection=driver.findElements(By.xpath("(//span/b[contains(text(),'selenium')])/.."));
 System.out.println(suggection.size());
 for(int i=0;i<suggection.size();i++) {
	 if(suggection.get(i).getText().equalsIgnoreCase("selenium Interview questions")){
		   suggection.get(i).click();
		     break;
	 
	 }
    
 }
 
	}

}