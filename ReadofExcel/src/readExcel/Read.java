package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream	fis = new FileInputStream("C:\\Users\\User 1\\Desktop\\Selenium\\Test Case\\TestCase135.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet Data	=wb.getSheet("Functionality");
			String Information=Data.getRow(5).getCell(1).getStringCellValue();
			System.out.println(Information);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}