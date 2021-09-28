package xpathTraversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https:/www.qspiders.com");
        driver.findElement(By.xpath("//span[.='Contact']")).click();
         Thread.sleep(8000);
        System.out.println( driver.findElement(By.xpath("//p[.='Bhubaneswar']/../..//span[.='+917077702027']")).getText());

	}

}
