package syntax.class32__Reading__Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * CREATE A PROPERTY FILE TO STORE following configurations:
browser=
url=
username=
password=

In your Selenum code use values from properties file to open specifified browser, 
navigate to specified url and enter username and password
 */
public class Task1 {
public static void main(String[] args) throws IOException {
	
	String filePath="C:\\Users\\gulen\\eclipse-workspace\\JavaBasics\\testdata\\Book1.xlsx";// our file location
	//or we can use String filePath1=System.getProperty("user.dir")+"\\testdata\\Book1.xlsx";
	
	FileInputStream fileInput=new FileInputStream(filePath);//bring it with FileInputStream
	
	Workbook book=new XSSFWorkbook(fileInput);
	Sheet sheet=book.getSheet("Sheet1");
	
	
	//need to find number of row
	int rows=sheet.getPhysicalNumberOfRows();
	
	//need to find number of coloums
	int colls=sheet.getRow(0).getLastCellNum();
	
	
	
	// get all data from excel file
	for(int r=0; r<rows; r++) {
		for(int c=0; c<colls; c++) {
			String colvalue=sheet.getRow(r).getCell(c).toString();
			System.out.print(colvalue+"  ");
		}System.out.println();
	}
}
}