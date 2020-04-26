package syntax.class31__IO__Properties;
//
//
//	import java.io.FileInputStream;
//	import java.io.FileNotFoundException;
//	import java.io.IOException;
//	import java.util.Properties;
//
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	/*
//	 * CREATE A PROPERTY FILE TO STORE following configurations:
//	browser=chrome
//	url=https://www.facebook.com
//	username=glnn
//	password=1234567
//
//	In your Selenum code use values from properties file to open 
//	specifified browser, 
//	navigate to specified url and enter username and password
//	 */
//	public class Homework {
//	public static void main(String[] args) throws IOException {
//		
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//		String filepath="C:\\Users\\gulen\\eclipse-workspace\\Selenium__Basics__Classes\\configs\\info.properties";
//		
//		WebDriver driver=new ChromeDriver();
//		
//		FileInputStream fileInput=new FileInputStream(filepath);
//		
//		
//		Properties prop=new Properties();
//		prop.load(fileInput);
//		
//		driver.get(prop.getProperty("url"));
//		driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
//		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
//		
//		System.out.println(driver.getTitle());
//	}
//	}