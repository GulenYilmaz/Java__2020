package syntax.class33__Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDtaFromXL {
public static void main(String[] args) throws IOException {
	
	
	String filepath=System.getProperty("user.dir")+"\\testdata\\test1.xlsx";
	
	FileInputStream fis=new FileInputStream(filepath);
	
	Workbook book= new XSSFWorkbook(fis);
	Sheet sheet=book.getSheet("Sheet1");// import ss format
	
	int rows=sheet.getPhysicalNumberOfRows();
	int cols=sheet.getRow(0).getLastCellNum();
	
	
	List<Map<String,String>>xlData=new ArrayList<>();
	
	for(int r=1; r<rows;r++) {// header so we can start r=1
		
		Map<String,String> map=new LinkedHashMap<>();
		
		for(int c=0; c<cols; c++){
			String key=sheet.getRow(0).getCell(c).toString();
			String value=sheet.getRow(r).getCell(c).toString();
         map.put(key, value);
		
		}
		
		xlData.add(map);
		

	}System.out.println(xlData);
	
	System.out.println(" ----- accessing each map separately -------    ");
	
	for(Map<String, String> map:xlData) {
		System.out.println(map);
	}
	
}
}
