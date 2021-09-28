package Test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


import ReadConfilt.Read_confiltfile;

public class Baseclass {
	public WebDriver driver;
	Read_confiltfile read=new Read_confiltfile();
	String URL=read.Read_Url() ;
	String chorme=read. chromedriv();
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver",chorme);
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get(URL);
}
	}
