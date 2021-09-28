package dropDwonList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		WebElement droplist=driver.findElement(By.name("shortCountryCode"));
		Select sel=new Select(droplist);
		sel.selectByValue("IN");

	}

}
