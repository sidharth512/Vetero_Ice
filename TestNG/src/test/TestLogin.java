package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import porn.ActitimeHomePage;
import porn.ActitimeLoginPage;

public class TestLogin {
	@Test 
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		 ActitimeLoginPage login=new  ActitimeLoginPage(driver);
		 login.loginMethod();
		 ActitimeHomePage homepage=new ActitimeHomePage(driver);
		 homepage.homepagemethod();
	}

}
