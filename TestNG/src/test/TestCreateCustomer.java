package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import porn.ActiTimeTaskPage;
import porn.ActitimeHomePage;
import porn.ActitimeLoginPage;
import porn.CustomerPage;
import porn.SettingPage;

public class TestCreateCustomer {
@Test
public void creatcustomer() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com");
	 ActitimeLoginPage login=new  ActitimeLoginPage(driver);
	 login.loginMethod();
	 ActitimeHomePage homepage=new ActitimeHomePage(driver);
	 homepage.homepagemethod();
	 ActiTimeTaskPage taskpage=new ActiTimeTaskPage(driver);
	 taskpage.TaskPagemethod();
	 CustomerPage creat= new CustomerPage(driver);
	 creat.CustomerPagemethod();
	 Thread.sleep(8000);
		
		 // Alert alt=driver.switchTo().alert(); alt.accept();
		 
	 SettingPage Setting=new SettingPage(driver);
	 Setting.TypeofworkMethod();
	 Setting.LeaveTypeMethods();
}
}
