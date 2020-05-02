package syntax.class32__Reading__Excel;
/*
 * 2. Using xl file that we created to new tour application 
 * (http://www.newtours.demoaut.com/) create a data driven test: 
Register to an account using 3-4 different sets of data 
(exclude passing values to the drop down and try to use different locators that you know if possible)
 */


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.LinkedHashMap;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Map;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	    /*
	     * 2. Using xl file that we created to new tour application 
	     * (http://www.newtours.demoaut.com/) create a data driven test: 
	        Register to an account using 3-4 different sets of data 
	        (exclude passing values to the drop down and try to use 
	        different locators that you know if possible)
	     */
	public class hm2_mercury {
	
	public static void main(String[] args) throws Exception {
	        String url = "http://www.newtours.demoaut.com";
	        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.get(url);
	        String filePath = "C:\\Users\\deger\\eclipse-workspace\\Selenium\\config\\Book1.xlsx";
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook book = new XSSFWorkbook(fis);
	        Sheet sheet = book.getSheet("Mercury");
	        int row = sheet.getPhysicalNumberOfRows();
	        int cell = sheet.getRow(0).getLastCellNum();
	        
	        
	        for (int r = 1; r < row; r++) {
	            
	            Map<String, String> map = new LinkedHashMap<>();
	            
	            driver.findElement(By.linkText("REGISTER")).click();
	            
	            for (int j = 0; j < cell; j++) {
	                
	                String key = sheet.getRow(0).getCell(j).toString();
	                String value = sheet.getRow(r).getCell(j).toString();
	                map.put(key, value);
	                switch (key) {
	                
	                case "firstName":
	                    driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(map.get(key));
	                    
	                    break;
	                case "lastName":
	                    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(map.get(key));
	                    
	                    break;
	                case "phone":
	                    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(map.get(key));
	                    break;
	                case "email":
	                    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(map.get(key));
	                    break;
	                case "address":
	                    driver.findElement(By.cssSelector("input[name='address1']")).sendKeys(map.get(key));
	                    break;
	                case "city":
	                    driver.findElement(By.xpath("//input[@name='city']")).sendKeys(map.get(key));
	                    break;
	                case "state":
	                    driver.findElement(By.xpath("//input[@name='state']")).sendKeys(map.get(key));
	                    break;
	                case "postalCode":
	                    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(map.get(key));
	                    break;
	                case "userName":
	                    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(map.get(key));
	                    break;
	                case "password":
	                    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(map.get(key));
	                    break;
	                case "confirmPassword":
	                    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(map.get(key));
	                    break;
	                }
	            }
	            Thread.sleep(6000);
	            driver.findElement(By.xpath("//input[@name='register']")).submit();
	            
	        }
	    }
	

}

