package syntax.class33__Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {
	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Cathed InterruptedException Exception");
		}

		System.out.println("Continue to next try block");

		String fPath = "";

		try {
			FileInputStream fis = new FileInputStream(fPath);

		} catch (FileNotFoundException fne) {
			System.out.println("Cathed FileNotFoundException Exception");
		}

		System.out.println("Continue to next try block");
		
		int a=10;
		int b=0;
		
		try {
			
			System.out.println(a/b);//new ArithmeticException();
			System.out.println("I am code inside try block");//this block will get ignored if exception occurs
		
		}catch (ArithmeticException ae) {
			System.out.println("Cathed ArithmeticException Exception");
		}

		System.out.println("End of the program");
	}
}




/*
ArrayIndexOutOfBoundsException 
– this exception means that we tried to access a non-existent array index, like when trying to get index 5 from an array of length 3.

ClassCastException 
– this exception means that we tried to perform an illegal cast, like trying to convert a String into a List. We can usually avoid it by performing defensive instanceof checks before casting.

IllegalArgumentException 
– this exception is a generic way for us to say that one of the provided method or constructor parameters is invalid.

IllegalStateException 
– This exception is a generic way for us to say that our internal state, like the state of our object, is invalid.

NullPointerException 
– This exception means we tried to reference a null object. We can usually avoid it by either performing defensive null checks or by using Optional.

NumberFormatException 
– This exception means that we tried to convert a String into a number, but the string contained illegal

 * 
 */
