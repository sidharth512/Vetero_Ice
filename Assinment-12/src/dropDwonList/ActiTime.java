package dropDwonList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//div[@class=\"menu_icon\"])[2]")).click();
		 * driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		 * driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		 * WebElement drop=driver.findElement(By.name("active")); Select scl=new
		 * Select(drop); scl.selectByValue("false"); List <WebElement>
		 * options=scl.getAllSelectedOptions(); options.size(); for(int
		 * i=0;i<options.size();i++) { System.out.println(options.get(i).getText()); }
		 * 
		 */

	}

}
