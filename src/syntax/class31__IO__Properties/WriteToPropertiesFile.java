package syntax.class31__IO__Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//write into existing file and add values
		String filePath="/Users/syntax/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("phoneNumber", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Added additonal key");
	
	}
}