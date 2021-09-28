package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyntraSearchbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
        driver.findElement(By.className("desktop-searchBar")).sendKeys("Tommy Hilfiger");
        Thread.sleep(8000);
        List<WebElement> suggection= driver.findElements(By.xpath("//li[@class=\"desktop-suggestion null\"]"));
       System.out.println( suggection.size());
       Thread.sleep(8000);
       for(int i=0;i<suggection.size();i++) {
    	   if(suggection.get(i).getText().equalsIgnoreCase("Tommy Hilfiger tshirts")){
    		   suggection.get(i).click();break;
    		
    		   
    	  }
			
			  Thread.sleep(5000); 
			  System.out.println(suggection.get(i).getText());
			 
       }
       
      
	}

}
