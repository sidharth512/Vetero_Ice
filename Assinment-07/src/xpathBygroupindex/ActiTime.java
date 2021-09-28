package xpathBygroupindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		/*
		 * driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
		 * driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(
		 * "manager"); Thread.sleep(3000);
		 * driver.findElement(By.linkText("Login")).click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//div[@class=\"menu_icon\"])[2]")).click();
		 */
	}

}
