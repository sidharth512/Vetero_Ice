package xpathbyText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		Thread.sleep(3000);
		
		  WebElement Text=driver.findElement(By.xpath("(//a[.='Forgot your password?'])"));
		  System.out.println(Text);
		  Text.click();
		 
       

	}

}
