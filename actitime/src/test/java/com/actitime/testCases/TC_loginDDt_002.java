/**
 * 
 */
package com.actitime.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.actitime.PageObjects.actitimeLoginPage;
import com.actitime.utility.XLUtils;


public class TC_loginDDt_002 extends LoginBaseClass{
	@Test(dataProvider="LoginData")
public void loginDDT(String uname,String pwd) throws InterruptedException {
		actitimeLoginPage page=new actitimeLoginPage(driver);
		page.setUsername(uname);
		page.setPassword(pwd);;
		page.ClickSubmit();
		
		
	}
	@DataProvider(name="LoginData")
	 String[][] getData() throws IOException{
		
		String path="C:\\Users\\User 1\\Desktop\\ecplics\\actitime\\src\\test\\java\\com\\actitime\\testData\\loginData.xlsx";
		int rownum=XLUtils.getRowCount(path,"sheet1" );
		int cellcount=XLUtils.getCellcount(path, "sheet1",rownum );
		String loginData[][]=new String [rownum][cellcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;i<cellcount;j++) {
				String logindata=XLUtils.getCellData(path, "sheet1", i, j);
				
				
			}
		}
		return loginData;
	}
	
	

}
