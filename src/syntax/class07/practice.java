package syntax.class07;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	
	/*write a program that prompts the user to input a positive integer.
	 *  it should then print the multiplication table of that number
	 * 
	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter positive integer number! ");
		int number=scan.nextInt();
		
		for(int x=1; x<=10; x++) {
			System.out.printf("%d+%d=%d \n",number,x,number+x);
		}
        

		
	}
}
