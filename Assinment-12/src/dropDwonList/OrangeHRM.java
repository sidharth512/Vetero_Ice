package dropDwonList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.xpath("//b[.='Directory']")).click();
WebElement dropdownlist=driver.findElement(By.xpath("//select[@name=\"searchDirectory[job_title]\"]"));
Select sel=new Select(dropdownlist);
sel.selectByVisibleText("HR Manager");
WebElement dropdownlist2=driver.findElement(By.xpath("//select[@class=\"selectableGroupWidget\"]"));
Select sel2=new Select(dropdownlist2);
sel2.selectByValue("5");
	}

}
