package xpathbyText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'First')]")).sendKeys("sid");
		driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		

	}

}
