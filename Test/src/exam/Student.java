package exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
         System.out.println(driver.getTitle());
         
         String actualurl=driver.getCurrentUrl();
         System.out.println(actualurl);
         //if(actualurl.contains("gmail"))
        	// if(actualurl.equalsIgnorCase("https://www.gmail.com/")) 
        	 {
        		// System.out.println("url's are matching");
	}
        //	 else
        	// {
        	//	 System.out.println("url's are notmatching");
        //	 }
}
	}
