package Self;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testdata {
public static void main(String[] args) throws IOException {
	String filePath="C:\\Users\\gulen\\eclipse-workspace\\JavaBasics\\testdata\\book2.xlsx";
	
	FileInputStream fis=new FileInputStream(filePath);
	
	Workbook book=new XSSFWorkbook(fis);
	
	Sheet sheet=book.getSheet("Sheet1");
	
	Row r=sheet.getRow(0);
    Cell c=r.getCell(1);
    String data =c.toString();
    System.out.println(data);
	
	
	
	
}
}
