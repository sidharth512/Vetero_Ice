package com.actitime.testCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.PageObjects.actiTimeTaskPage;
import com.actitime.PageObjects.actitimeCustomerPage;
import com.actitime.PageObjects.actitimeHomePage;
import com.actitime.PageObjects.actitimeLeavePage;
import com.actitime.PageObjects.actitimeLoginPage;
import com.actitime.PageObjects.actitimeSettingPage;
import com.actitime.PageObjects.actitimeTypesofWorkpage;




 public class TC_LoginTest_001 extends LoginBaseClass{
	@Test
	public void loginTest() throws InterruptedException {
		
		actitimeLoginPage page=new actitimeLoginPage(driver);
		
		page.setUsername(username);
		page.setPassword(password);
		page.ClickSubmit();
		 String currentUrl=driver.getCurrentUrl();
		String Tittle=driver.getTitle();
		
		/*
		 * Assert.assertTrue(currentUrl.contains(".actitime.com"));
		 * System.out.println("At actitime Home page");
		 */
		  
		  Assert.assertTrue(Tittle.contains("actiTIME"));
		  System.out.print("HomePage");
	}
	@Test(priority=2)
	
	public void HomePage() {
		actitimeHomePage Home=new actitimeHomePage (driver);
		Home.homepageTaskmethod();
		}
		
	
		
	
	@Test(priority=3)
	public void TaskPage() throws InterruptedException {
		actiTimeTaskPage TaskPage=new actiTimeTaskPage(driver);
		Thread.sleep(5000);
	
		TaskPage.TaskPagemethod();
		System.out.println("Task complit");
		
		
	}
	@Test(priority=4)
		
	public void CreatCustomer() throws InterruptedException {
		actitimeCustomerPage customer=new actitimeCustomerPage(driver);
		customer.CustomerPagemethod();
	}
	@Test(priority=5)
	public void Setting() throws InterruptedException {
		actitimeSettingPage Setting=new actitimeSettingPage(driver);
		Thread.sleep(8000);
		Setting.TypeofworkMethod();
		Setting.LeaveTypeMethods();
	
		
	}
	@Test(priority=6)
	public void Leavepage() {
		actitimeLeavePage Leave=new actitimeLeavePage (driver);
		Leave.LeavePageMethod();
		Leave.CreatLeaveMethod();
	
		
	}
	@Test(priority=7)
	public void logout() {
		actitimeHomePage logout=new actitimeHomePage(driver);
		logout.Homepagelogoutmethod();
	}
}
