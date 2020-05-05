package syntax.class34__Utils_throw_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {

	public static int division(int num, int num1) {

		int result = 0;
		
		try {
			result=num / num1;//new ArithmeticException();
			System.out.println(result);
		} catch (ArithmeticException ae) {
			//ae.printStackTrace();//detailed message of an exception
			System.out.println(ae.getMessage());//message of an exception
			//System.out.println(ae);
		} finally {
			System.out.println("I am a finally block");
		}
		
		return result;
	}
	
	public static void read(String filePath) {
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream(filePath);
			Properties prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
