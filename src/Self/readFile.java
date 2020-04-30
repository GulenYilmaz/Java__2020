package Self;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class readFile {
public static void main(String[] args) throws IOException {
	
	String filePath="C:\\Users\\gulen\\eclipse-workspace\\JavaBasics\\configs\\configuration.properties";//file s address
	
	FileInputStream fis=new FileInputStream (filePath);// input a erisebilmek icin 
	
	Properties prop=new Properties();//inputlari okuyabilmek icin class olusturduk---> sadece txt den bilgi almak icin kullaniyoruz
	
	prop.load(fis);// properties icerisine fis den gelen bilgileri indiriyoruz
	
	System.out.println(prop.getProperty("lastname"));
	System.out.println(prop.getProperty("lastname"));
	System.out.println(prop.getProperty("city"));
	
	Set<Entry<Object, Object>> entry=prop.entrySet();
	
	for(Entry<Object, Object> e: entry) {
		System.out.println(e);
	}
	
	
	
	
	
}	
}

