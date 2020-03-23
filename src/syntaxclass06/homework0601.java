package syntaxclass06;

import java.util.Scanner;

public class homework0601 {

	public static void main(String[] args) {
	
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which
		 *  language user speaks.
		 */	
		Scanner scan;
        String country;
        String language;
        scan = new Scanner(System.in);
        
        System.out.println("Please enter your country");
        country = scan.nextLine();
        
        switch (country) {
        case "Mexsico":
            language = "Spanish";
            break;
        case "Germany":
        	language = "German";
            break;
        case "Denmark":
        	language = "Danish";
            break;
        case "Turkey":
        	language = "Turkish";
            break;
        case "France":
        	language = "France";
            break;
        case "England":
        	language = "English";
            break;
        default:
        	language = "Unknown";
        }  
        System.out.println("Your language is "+language);

		
		
		
		
	}
}
