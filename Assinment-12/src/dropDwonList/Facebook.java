package dropDwonList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com");
	       driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]")).click();
	       Thread.sleep(3000);
	      WebElement droplist= driver.findElement(By.id("day"));
          Select sel=new Select(droplist);
         sel.selectByValue("1");
        WebElement droplist2=driver.findElement(By.id("month"));
        Select sel2=new Select(droplist2);
        sel2.selectByValue("6");
        WebElement droplist3=driver.findElement(By.id("year"));
        Select scl3=new Select(droplist3);
        scl3.selectByValue("1996");
         System.out.println(scl3.isMultiple());
	}

}
