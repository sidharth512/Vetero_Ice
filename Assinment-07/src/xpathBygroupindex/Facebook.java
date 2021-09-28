package xpathBygroupindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com");
		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sid");
		 //driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("pap");
		 driver.findElement(By.xpath("//a[@href=\"/pages/create/?ref_type=registration_form\"]")).click();
		 driver.findElement(By.xpath("(//div[@data-hover=\"tooltip\"])[3]")).click();
		 

	}
	}


