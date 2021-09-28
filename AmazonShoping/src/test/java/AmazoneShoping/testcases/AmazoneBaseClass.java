package AmazoneShoping.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import AmazoneShoping.utility.ReadConfigurationd;

public class AmazoneBaseClass {
	ReadConfigurationd page=new ReadConfigurationd();
	public String BaseUrl=page.GetUrl();
	public String sreachObject=page.getsreachObject();
	public  static WebDriver driver;

		
		 @Parameters("browser")
			
			@BeforeClass
			public void setup(String br) throws InterruptedException
			{
			
				if(br.contains("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");
				driver=new ChromeDriver();
				}

	 		else if(br.equalsIgnoreCase("edge"))
	 		{
	 			System.setProperty("webdriver.edge.driver", "./WebDrivers/msedgedriver.exe");
	 			driver=new EdgeDriver();
	 		} 
			
	}
//	@BeforeMethod()
	/*
	 * public void enterurl() {
	 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 * driver.get(BaseUrl);
	 * 
	 * }
	 */
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
	
	
}
