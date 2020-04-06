package syntax.class06;

import java.util.Scanner;

public class Homework0603 {

	public static void main(String[] args) {
		
		/*
		 *  Using scanner class create calculator. 
		 *  Allow user to enter 2 numbers and operator(+,-,*,/). 
		 *  Based on operator provide the result to user.
		 */		
		Scanner scan;
		int num1;
		int num2;
		char operator;
		int result;	
		scan=new Scanner(System.in);		
		System.out.println("Please enter first number ");
		num1=scan.nextInt();	
		System.out.println("Please enter second number ");
		num2=scan.nextInt();
		System.out.println("Please enter your operator: +,-,*,/ ");
		 operator=scan.next().charAt(0);
		result=0;
		switch (operator) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;	
		default:
			System.out.println("You have entered wrong operator");
		}
		System.out.println(result);
	}
}
