package syntax.class33__Exceptions;

import java.util.Scanner;

/*1 How would handle InputMismatchException?
 *  Input Mismatch Exception when user enters mismatch value then programmer expected.


 */
public class Task1 {
public static void main(String[] args) {
	
	
	        //if we try to enter String as input. 
			//it'll throw InputMismatchException
			Scanner scan = new Scanner(System.in);
			int num = 0;
			System.out.print("Enter an integer: ");
			try {
				num = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Exception name is: "+e);
			}
	
	
}
}
