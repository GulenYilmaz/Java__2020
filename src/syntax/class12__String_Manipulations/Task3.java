package syntax.class12__String_Manipulations;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
Write a program that reads two people’s first names and 
if they expecting boy or girl?

Based on the input suggests a name for a baby:

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL */
	
	
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter momys name?");
//        String mom= scan.nextLine();
//        
//        System.out.println("Please enter days name?");
//        String dad= scan.nextLine();
//
//        System.out.println("Please enter your expected- boy or girl -?");
//        String exp= scan.nextLine();
//        
//        
//	if (exp.contains("b")) {
//		String name=mom.substring(0,3)+dad.substring(3,6 );
//		System.out.println("you are expecting boy and name is= "+name);
//	}else {
//		String name=mom.substring(0,3)+dad.substring(3,6 );
//		System.out.println("you are expecting girl and name is= "+name);
//	}
//	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is Mom's first name");
		String mom = scan.nextLine();
		
		System.out.println("What is Dad's first name");
		String dad = scan.nextLine();
		
		System.out.println("Boy or Girl");
		String baby = scan.nextLine();
		
		String SuggestedName = null;
		int half1 = mom.length() / 2;
		int half2 = dad.length() / 2;
		
		if (baby.equalsIgnoreCase("Girl")) {
			
			SuggestedName = mom.substring(0, half1) + dad.substring(half2);
			
			System.out.println(SuggestedName);
			
		} else if (baby.equalsIgnoreCase("Boy")) {
			
			SuggestedName = dad.substring(0, half2) + mom.substring(half1);
			
			System.out.println(SuggestedName);
				}
	}

}
