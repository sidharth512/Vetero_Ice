package xpathbyText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/User 1/Desktop/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement Element=driver.findElement(By.xpath("//a[.='Forgot your password?']"));
		System.out.println(Element);
		Element.click();

	}

}
