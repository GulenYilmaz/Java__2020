package syntax.class08__Loops;

import java.util.Scanner;

public class Task0804 {

	public static void main(String[] args) {
	
/* Write a program that reads a range of integers
(start and end point), provided by a user and 
then from that range prints the sum of the even and odd integers.
 */
		
		
        Scanner scan=new Scanner(System.in);
        
        
        int evenSum=0;;
        int oddSum=0;
        int i=0;// dongu degiskeni tanimlamamiz gerek kac kere donecegini hesaplamak icin

        System.out.println("Please enter first numbers");
        int num1=scan.nextInt();
        
        System.out.println("Please enter second numbers");
        int num2=scan.nextInt();
        
        for(i=num1;i<=num2;i++) {
            if(i%2==0) {
                evenSum=evenSum+i;
                System.out.println("even numbers total = "+evenSum);
            }else  {
            	oddSum=oddSum+i;
            	System.out.println("odd numbers total = "+oddSum);
            }     
            }
        System.out.println("-----------------");
        
        int totalEven = 0;
		int totalOdd = 0;
		System.out.print("Please enter two numbers: ");
		int min = scan.nextInt();
		int max = scan.nextInt();
		for (int j = min; j <=max; j++) {
			if (j % 2 == 0) {
				totalEven = totalEven + j;
			}
			else {
				totalOdd = totalOdd + j;
			}
		}
		System.out.format("The total of even numbers between %d to %d is %d.\n", min , max , totalEven);
		System.out.format("The total of odd numbers between %d to %d is %d.\n", min , max , totalOdd);
        
        
	}
}
