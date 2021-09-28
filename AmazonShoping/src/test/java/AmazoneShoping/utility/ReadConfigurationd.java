package AmazoneShoping.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigurationd {
	Properties pro;
	public ReadConfigurationd() {
		try {
		File src=new File("C:\\Users\\User 1\\Desktop\\ecplics\\AmazonShoping\\ConfigurationAmazonShoping\\config.propertiesfiles");
	
		FileInputStream fis = new FileInputStream(src);
	    pro=new Properties(); 
		pro.load(fis);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		}
		

	public String GetUrl() {
	 String url=pro.getProperty("Baseurl");
		return url;
	}
	public String getsreachObject() {
		String object=pro.getProperty("searchobject");
		return object;
	}

}
