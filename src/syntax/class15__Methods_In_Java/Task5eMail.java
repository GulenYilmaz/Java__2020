package syntax.class15__Methods_In_Java;

import java.util.Scanner;

public class Task5eMail {
	
	//Create a method createEmail(). Based on provided users name, 
	//lastName and email type, your method should return complete email Address. 
	//Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	
	
	Scanner scan= new Scanner (System.in);
	
	String createEmail() {
		String userName;
		String lastName;
		String eMailType;
		
		String eMail="";
		userName= scan.nextLine();
		lastName= scan.nextLine();
		eMailType= scan.nextLine();
		eMail=userName.concat(lastName).concat(eMailType);
		return eMail;
	}
	
	
	
	
	public static void main(String[] args) {

		Task5eMail obj = new Task5eMail();
		
		System.out.println("please enter user name ");
		System.out.println("please enter last name ");
		System.out.println("please enter e mail type extention ");
		System.out.println();
		
		String eMailAdress=obj.createEmail();
		System.out.println("Your e mail adress is "+ eMailAdress);
		
		
		
	}

}
