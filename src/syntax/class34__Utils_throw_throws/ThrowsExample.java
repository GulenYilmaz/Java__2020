package syntax.class34__Utils_throw_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(filePath);// new FileNotFoundException();
	}
	
	
	
	
	
	public static void multipleSleep() {
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}}
	
	
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	
	
public static void main(String[] args)  {
		
		multipleSleep();
		
		try {
			read("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("--- END OF THE CODE ----");
	}

	

	
}
