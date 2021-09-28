package ReadConfilt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Read_confiltfile {
	Properties pro;
	public Read_confiltfile() {
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\Ice\\confiltFile");
		 pro=new Properties();
		pro.load(file);
		}
		catch(IOException e){
			System.out.println("Error");
		}
	}
	public String Read_Url() {
		String url=pro.getProperty("BaseUrl");
		return url;
	}
	public String chromedriv() {
		String drivers=pro.getProperty("CDriver");
		return drivers;
	}

}
