package interfacewrbelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https:/www.facebook.com");
     WebElement username= driver.findElement(By.id("email"));
     username.sendKeys("qspiders");
     //username.sendKeys(Keys.BACK_SPACE);
      String w=username.getAttribute("value");
      int x=w.length();
   //   for(x=7;x<8;x++)
    //  {    
		/*
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.ARROW_LEFT);
		 * username.sendKeys(Keys.BACK_SPACE); username.sendKeys(Keys.ARROW_LEFT);
		 * username.sendKeys(Keys.ARROW_LEFT); username.sendKeys(Keys.BACK_SPACE);
		 * 
		 * String name=username.getAttribute("value"); System.out.println(name); // }
		 */
      
     for(x=4;x<5;x++) {
    	  for(x=2;x<=3;x++) {
    		  if(x==2) {
    			  username.sendKeys(Keys.ARROW_LEFT);
    		  }
    	   else {
    				  username.sendKeys(Keys.BACK_SPACE);	  
    			  
    		  }
    		  
    		  username.sendKeys(Keys.ARROW_LEFT);  
     }
    	  username.sendKeys(Keys.ARROW_LEFT);  
    	     
    	   }
     username.sendKeys(Keys.BACK_SPACE);
    String name= username.getAttribute("value");
    System.out.println(name);
      
			/*
			 * username.sendKeys(Keys.BACK_SPACE); for(x=1;x<6;x++) {
			 * username.sendKeys(Keys.ARROW_LEFT); } username.sendKeys(Keys.BACK_SPACE);
			 */
	}
}
//}
	
