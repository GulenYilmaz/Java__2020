package syntax.class31__IO__Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
public static void main(String[] args) throws IOException {
	
	
	
	
	String filePath="configs\\TAsk1.properties";
	System.out.println(filePath);
	
	FileInputStream fileInput=new FileInputStream(filePath);
	
	Properties prop=new Properties();
	
	prop.load(fileInput);//building stream is must
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	
}
}
