package readExcel;

import java.io.IOException;

import pomclass.ReadofExcel;

public class EmpliMetationOfExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadofExcel Exl=new ReadofExcel("C:\\Users\\User 1\\Desktop\\Selenium\\Test Case\\TestCase135.xlsx");
	Exl.getData(1, 1, 0);
	Exl.totaldata("Template");
	}

}
