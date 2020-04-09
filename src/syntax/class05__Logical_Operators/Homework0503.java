package syntax.class05__Logical_Operators;


import java.util.Scanner;

public class Homework0503 {

	public static void main(String[] args) {
		/*Write a program to find 
		 * largest of three double values using
		 *  if-else..if and logical operators provided by a user 
		 * (numbers must be distinct)
		 * 
		 */
Scanner scan= new Scanner(System.in);

        System.out.println("Please enter your first number");
		double num1;
        num1=scan.nextDouble();
		
        System.out.println("Please enter your second number");		
		double num2;
        num2=scan.nextDouble();
		
        System.out.println("Please enter your third number");
		double num3;
		num3=scan.nextDouble();
		
		double largest=0;
		if (num1>num2 && num1>num3) {
			largest=num1;
		}else if(num2>num1 && num2>num3) {
			largest=num2;
		}else if(num3>num1 && num3>num2) {
			largest=num3;
		}
		System.out.println("Largest number is "+largest);
	}
}
