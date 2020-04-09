package syntax.class07__Loops;

import java.util.Scanner;

public class PracticeUsluSayilar {

	public static void main(String[] args) {
		/*
		 * two numbers are entered throuh the keyboard. 
		 * white a program to find the value of one number 
		 * raised to the power of another
		 * do not use Java built in method
		 */
		   
        Scanner scan = new Scanner(System.in);
        
        System.out.println("please enter two number");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int i;
        int result=1;
        
        for(i=1;i<=num2;i++) {
            result=result*num1;
            
        }
        
        System.out.println(result);
        
    }
}








