package syntax.class32__Reading__Excel;

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

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "\\testdata\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols =sheet.getRow(0).getLastCellNum();
		
		List<Map<String, String>> listMap=new ArrayList<>();
		
		for(int r=1; r<rows; r++) {
			
			Map<String, String> map=new LinkedHashMap<>();
			
			for(int c=0; c<cols; c++) {
				
				String key=sheet.getRow(0).getCell(c).toString();// we can get our key from excel
				String value=sheet.getRow(r).getCell(c).toString();//we can get our values from excel
				map.put(key, value);// we can create our map
			}
			
			listMap.add(map);//inside the link collection we can print our maps
			
		}
		
		System.out.println(listMap);
		//--->[{name=nora, lastname=faraday, address=f 12, zipcode=12345.0, state=mi, username=admin1, password=1234.0, county=USA}, 
		//{name=naomi, lastname=faraday, address=e 23, zipcode=12346.0, state=ny, username=admin2, password=1235.0, county=USA}, 
		//{name=matth, lastname=faraday, address=d 24, zipcode=12347.0, state=mi, username=admin3, password=1236.0, county=USA}]

	}
}