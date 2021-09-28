package xpathTraversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https:/opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[.='Directory']")).click();
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("//b[.='Paul p Collings']/../..//li[.='HR Manager']")).getText());
       // System.out.println(driver.findElement(By.xpath("//b[.='Paul p Collings']/../..//li[.='Human Resources']")).getText());
        System.out.println(driver.findElement(By.xpath("(//b[.='Paul p Collings']/../..//li[@style=\"font-size: 12px;\"])[4]")).getText());
	}
	

}
