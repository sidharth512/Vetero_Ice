package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanJose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.americanairlines.in");
		 driver.findElement(By.name("origin")).sendKeys("san");
		 Thread.sleep(3000);
		 List<WebElement> links=driver.findElements(By.xpath("//li[contains(@role,\"presentation\")]"));
		 System.out.println(links.size());
		 for(int i=0;i<links.size();i++)
		 {
			 if(links.get(i).getText().equalsIgnoreCase("San Jose (SJO), Costa Rica"))
			 {
				 links.get(i).click();
			 }
		 }
		 
    driver.findElement(By.name("destination")).sendKeys("lan");
    Thread.sleep(3000);
    List<WebElement> links2=driver.findElements(By.xpath("//li[contains(@class,\"ui-menu-item\")]"));
    System.out.println(links.size());
    for(int i=0;i<links2.size();i++)
    {
    	if(links2.get(i).getText().equalsIgnoreCase("Lanzarote (ACE), Spain"))
    	{
    		links2.get(i).click();
    	}
    }
	}

}
