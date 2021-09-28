package ReadExcelData;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;




public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\User 1\\Desktop\\xl jars\\SID\\TestCase135.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet book=wb.getSheetAt(1);
		int count=book.getLastRowNum();
		System.out.println(count+1);
		for(int i=8;i<count;i++) {
			String information=book.getRow(i).getCell(1).getStringCellValue();
			System.out.println(information);
		}
		/*
		 * XSSFSheet book=wb.getSheet("Template"); String
		 * data=book.getRow(0).getCell(0).getStringCellValue();
		 * System.out.println(data);
		 */
	}
	

}
