package automation;

import java.io.FileInputStream;

import java.io.IOException;



import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdatafromexcelsheet {
public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("G:\\9A668C00.xlsx");
	
	String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
}
}
