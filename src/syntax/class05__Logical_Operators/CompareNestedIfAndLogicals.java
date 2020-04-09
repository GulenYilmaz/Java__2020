package syntax.class05__Logical_Operators;

import java.util.Scanner;

public class CompareNestedIfAndLogicals {

	public static void main(String[] args) {
		/*
		 * write a program to ask user if there is a sale
		 * if there is no sale---> not going shopping
		 * if sale---> we will ask the price of the item
		 * based on the price we will apply discount and 
		 * calculate final price
		 * 
		 * if price less than 20---> 10%
		 * if price between  20 and 100---> 20%
		 * if between 100 and 500--->30%
		 * if price more than 500----> apply 50%
		 * 
		 * after discount___ the price of  item reduced from_to_
		 */
         Scanner scan;
         String sale;
         double price;
         double discount=0;
         double finalPrice;
         
         scan=new Scanner(System.in);
         System.out.println("Is there any sale?");
		 sale=scan.nextLine();
		
		if (sale.equals("Yes")) {
			System.out.println("What is the price of item?");
			 price=scan.nextDouble();
			 
			    if (price <=20) {
					discount = (price * 0.10);
				} else if (price >20 && price <=100) {
					discount = (price * 0.20);
				} else if (price > 100 && price <= 500) {
					discount = (price * 0.30);
				} else {
					discount = (price * 0.50);
				}

		 
	     finalPrice=price-discount;
	     System.out.println("After discount "+discount+" the price of the item reduced from " 
	     +price+" to "+finalPrice);
		
		}else {
			System.out.println("Not going shopping");
		}
	}
}
