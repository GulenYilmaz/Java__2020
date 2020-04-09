package syntax.class05__Logical_Operators;

import java.util.Scanner;

public class HomeWork0502 {

	public static void main(String[] args) {
	/*
	 * Write a program for user to enter his/hers birth month. 
	 * Based on the month define the season.
Example: if user is born in June, July or August → season =“Summer�?.
At the end of the program we should see output as “You were born ______“.

	 */
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter your birth month?");
		String birth;
		String season=null;//String season="";same initialized--> when compiler giver you error
		                   // saying variable must be initialized:
		                   // compiler can assign default 
		
		birth=scan.nextLine();
		if(birth.equals("December") || birth.equals("January") || birth.equals("February") ) {
			season="Winter";
		}else if(birth.equals("March") || birth.equals("April") || birth.equals("May") ) {
			season="Spring";
		}else if(birth.equals("June") || birth.equals("July") || birth.equals("August") ) {
			season="Summer";
		}else if(birth.equals("September") || birth.equals("October") || birth.equals("November") ) {
			season="Fall";
		}else {
			season="Invalid";
			System.out.println("Please enter valid month");
		}
		System.out.println("You were born in "+season+".");
	}
}
