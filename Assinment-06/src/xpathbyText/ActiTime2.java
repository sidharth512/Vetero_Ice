package xpathbyText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager"); 
		  driver.findElement(By.xpath(("//div[.='Login ']"))).click();
		  Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[.='Tasks']")).getText())  ;
		/*  WebElement Link=driver.findElement(By.xpath("//span[.='Task']"));
		  System.out.println(Link); Link.click();*/
		
	}

}
