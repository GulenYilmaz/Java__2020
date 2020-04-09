package syntax.class04__Nested_If;

import java.util.Scanner;

public class Task0405Salary {
	public static void main(String[] args) {
	//rite a program to ask user to enter numbers of worked years and annual salary.
	//	If user worked for more or equals to 5 years than user is eligible for the bonus, 
	//	otherwise he is not. Once user is eligible and salary is larger than 50000 
	//	than bonus = 5000, otherwise bonus=3000.	
	
	Scanner userinput= new Scanner (System.in);
	System.out.println("How many years have you work?");
	
	int year=userinput.nextInt();
	
	
	if (year>=5) {
		System.out.println("What is your annual salary?");
		double salary=userinput.nextDouble();
		System.out.println("You are elligible for the bonus!!");
    
		
		if (salary>=50000) {
    	System.out.println("Your bonus amoun is 5000.");
    }else {
    	System.out.println("Your bonus amount is 3000.");
    }
	}else {
    System.out.println("Sorry, You are not eligible for the bonus");	
}
	}
}