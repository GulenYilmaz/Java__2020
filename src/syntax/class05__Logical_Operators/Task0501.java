package syntax.class05__Logical_Operators;


import java.util.Scanner;

public class Task0501 {

	public static void main(String[] args) {
		/*1.Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
short (under 60 inch)
medium(between 60 -72 inch)
tall (over 72 inch)
 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please Enter  Your height in inches");
		int height=input.nextInt();
	
		
		if(height>0 && height<=60) {
			System.out.println("Message:Short");
		}else if(height>=61 && height<=72) {
			System.out.println("Message:Medium");
		}else if (height>72) {
			System.out.println("Message: Tall");
		}else {
			System.out.println("You are super tall");
		}
		
	}

}
