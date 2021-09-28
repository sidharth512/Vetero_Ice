package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
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
			
			  ActitimeHomePage setting=new ActitimeHomePage(driver);
			  setting.homepagesettingmethod();
				
				  SettingPage workLink= new SettingPage(driver);
				  workLink.TypeofworkMethod();
					
					
					  TypesofWorkpage Link=new TypesofWorkpage(driver);
					  Link.NewTypeofWorkMehod();
					 
				  
				  SettingPage LeaveType= new SettingPage(driver);
				  LeaveType.LeaveTypeMethods();
 
				 
			 
	}

}
