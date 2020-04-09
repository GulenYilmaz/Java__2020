package syntax.class04__Nested_If;

import java.util.Scanner;

public class Task0403Loan {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("What is the amont of loan is needed");
        int loan=input.nextInt();
        
        if(loan<=200000) {
        	System.out.println("you would lend the money");
        }else {
        	System.out.println("you would reject the client");
        }
        
        System.out.println("Please enter a second number");
        
	}

}
