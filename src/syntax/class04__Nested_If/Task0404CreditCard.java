package syntax.class04__Nested_If;
import java.util.Scanner;

public class Task0404CreditCard {
public static void main(String[] args) {
	/*Create a Java program that will ask if user has a credit card or not. 
	 * If you user does not have a credit card then offer them. 
	 * If they do have one ask what is balance on the card? 
	 * If balance of the card is larger than 1000, 
	 * tell them to pay off immediately, 
	 * otherwise you can tell them that they can spend more
		*/
	Scanner input=new Scanner (System.in);
	System.out.println("Do you have a credit card?");
	String card=input.nextLine();
	
	if (card.equals ("yes")){
		System.out.println("What's your balance?");
		
		int balance=input.nextInt();
		if (balance>=1000) {
			System.out.println("You need to pay immediately");
		}else {
			System.out.println("You can spend more");
		}
	
	
	}else {
		System.out.println("Would you like to get a new one?");
		}
	
	
}
}
