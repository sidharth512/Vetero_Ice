package xpathbyText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		
		  WebElement link=driver.findElement(By.xpath("//a[.='Home & Living']"));
		  Thread.sleep(8000); 
		  System.out.println(link);
		  link.click();
		 
		
			/*
			 * Thread.sleep(8000);
			 * driver.findElement(By.xpath(("//a[contains(text(),'Living')])[1]"))).click();
			 */

	}

}
