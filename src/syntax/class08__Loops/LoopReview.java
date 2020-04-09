package syntax.class08__Loops;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
	/*
	 * ask a user to pay for a cany
	 * as long as the entered price is not 2
	 * we need keep ask for paying
	 * one amount is corrct--> "enjoy your cady"	
	 */
		
		Scanner s;
		double price;
		
		s=new Scanner(System.in);
		
		do {
		System.out.println("Please pay for a candy");
		price=s.nextDouble();
		}while(price!=2);// eger fiyat esit degilse do ya geri donuyor esitseenjoy your cady
		
		System.out.println("Enjoy your cany");
		
System.out.println("---------------------while-------------------------");

          System.out.println("Please pay for a candy");
          price=s.nextDouble();
		 while(price!=2) {// --->2 ye esit degilse true
			 System.out.println("please pay for a candy");
			 price=s.nextDouble();
		 }
		 System.out.println("Enjoy your cany");
			
	}
}
