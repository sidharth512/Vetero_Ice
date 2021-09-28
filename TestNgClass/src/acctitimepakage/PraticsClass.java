package acctitimepakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.Orangehrm;

public class PraticsClass {
	WebDriver driver;

@Test(priority=1)
public void m1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/Selenium/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com");
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	Assert.assertTrue(currenturl.contains("orangehrmlive"));
	Orangehrm org=new Orangehrm(driver);
	try {
		org.loginMethod();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	/*
	 * HomePage leave=new HomePage(driver);
	 * leave.leaveTextMethod();System.out.println("login  page of selenium");
	 */
}
@Test(priority=2)
public void m2() throws InterruptedException {
	
	HomePage leave=new HomePage(driver);
	leave.leaveTextMethod();
	System.out.println("Home page of selenium");
		
	
}
@Test(priority=3)
public void m3() {
	System.out.println("logout from selenium");
	
}
}
