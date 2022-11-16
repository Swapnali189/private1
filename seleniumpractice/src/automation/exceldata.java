package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\book2.xlsx");
		
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}
}
