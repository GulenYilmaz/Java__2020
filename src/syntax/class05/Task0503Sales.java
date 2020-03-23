package syntax.class05;

import java.util.Scanner;

public class Task0503Sales {

	public static void main(String[] args) {
		
	Scanner data=new Scanner(System.in);
	int sales;
	System.out.println("How much sales?");
	sales=data.nextInt();
	
	if(sales>=1 && sales<=100) {
		System.out.println("You get "+sales*0.1);
	}else if (sales>100 && sales<=200) {
		System.out.println("You get "+sales*0.2);
	}else if (sales>200 && sales<=500) {
		System.out.println("You get "+sales*0.3);
	}else {
		System.out.println("You rock get "+sales*0.5);
	}
	
	// if commission is >100--> you are awesome seller
	//code below will give error since commission not have any value
	// if(commission>100) {
// System.out.println(" you are an awesome seller")
	//}
		
		
	
	}
}
