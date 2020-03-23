package syntaxclass08;

import java.util.Scanner;

public class Task0803 {

	public static void main(String[] args) {
/* Create a program that will be asking user to apply for a credit 
 * card 10 times. 
 * As soon you get an “yes” 
 * from a user program should stop asking.*/
		
		Scanner scan=new Scanner(System.in);
		
		String yes;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			yes=scan.nextLine();
			if(yes.equals("yes")) { 
				System.out.println("Congratulations!");
				break;
			
			}	 
			}
	
	}
}
