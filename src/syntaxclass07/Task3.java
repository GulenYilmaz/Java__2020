package syntaxclass07;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*we are playing a lottery and a lucky number is 17
		 * we want to keep asking user any number from 1-20
		 * until he guess the luck ---> congrats
		 * 
		 */


		Scanner input;
		int num=1;
		
		
		input=new Scanner(System.in);
		
		while(num<=20) {
			System.out.println("Please enter Number between 1 - 20 ");
			num=input.nextInt();
			
			if (num==17) {
				System.out.println("Congrats ");
			}else {
				System.out.println("Tyr again");
				}
			num++;
		}	
		System.out.println("---------------");
		
		Scanner scan;
		int number;
		int luckyNumber=17;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter Number between 1 - 20");
			number=scan.nextInt();
		} while (number!=luckyNumber); //eger true ise do ya geri donuyoresit ise do ya geri donmeden asagiya iniyor
		System.out.println("you got it");
		
		
		
		
		
		
}	
}
