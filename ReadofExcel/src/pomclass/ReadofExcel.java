package pomclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadofExcel {
	XSSFWorkbook wb;
	XSSFSheet Data;
	public ReadofExcel(String excelpath) throws IOException {
		FileInputStream	fis = new FileInputStream(excelpath);
		 wb=new XSSFWorkbook(fis);
	}


public void getData(int sheetNumber,int row,int column) throws IOException {
	 Data	=wb.getSheetAt(sheetNumber);
		
	  String Information=Data.getRow(5).getCell(1).getStringCellValue();
	  System.out.println(Information);
	// return Information;

}
	public int totaldata(String Sheetname) {
		
		
		XSSFSheet book=wb.getSheet(Sheetname);
        int count=book.getLastRowNum();
	for(int i=8;i<count;i++) {
		String information=Data	.getRow(i).getCell(1).getStringCellValue();
		System.out.println(information);
}
	return count;
	}


	
		
	}
	

