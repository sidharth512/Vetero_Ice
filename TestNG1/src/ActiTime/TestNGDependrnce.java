package ActiTime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestNGDependrnce {
	
	public WebDriver driver;
@Test
public void loginPage() 
{
	FileInputStream fis;
	try {
		fis = new FileInputStream("C:\\Users\\User 1\\Desktop\\Selenium\\Test Case\\TestCase135.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Data	=wb.getSheet("Functionality");
		String Information=Data.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Information);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
/*
 * public void loginPage() { System.setProperty(
 * "webdriver.chrome.driver","C:/Users/User 1/Desktop/Selenium/chromedriver.exe"
 * ); driver=new ChromeDriver(); driver.manage().timeouts().implicitlyWait(20,
 * TimeUnit.SECONDS); driver.get("https://demo.actitime.com"); String
 * currentUrl=driver.getCurrentUrl();
 * Assert.assertTrue(currentUrl.contains(".actitime.com"));
 * System.out.println("At loginPage of ActiTime");
 */
}
//@Test(dependsOnMethods="loginPage")
//public void logedintoHomePage(){
	/*driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.name("remember")).click();
	driver.findElement(By.linkText("Login" )).click();
	 String homeurl=driver.getCurrentUrl();
	 //System.out.println(homeurl);
	 Assert.assertTrue(homeurl.contains("login.do"));*/
	 //System.out.println("At HomePage of ActiTime");
}
//@Test(dependsOnMethods="logedintoHomePage")
/*public void logintoTaskPage() {
	driver .findElement(By.xpath("//div[.='Tasks']")).click();
	*/
	
	



