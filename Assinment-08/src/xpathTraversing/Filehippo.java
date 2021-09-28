package xpathTraversing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filehippo {
	
	public static void main(String[] args)throws InterruptedException 
   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/User 1/Desktop/NewChrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://filehippo.com");
		driver.findElement(By.xpath("//a[.='Popular software']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[.='VLC Media Player 64-bit']/../../../..//span[.='Download']")).click();
	}

}
