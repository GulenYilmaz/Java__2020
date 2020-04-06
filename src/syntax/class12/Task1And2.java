package syntax.class12;

import java.util.Scanner;

public class Task1And2 {
public static void main(String[] args) {
	
	
	/*1) Create a String and print it in reverse order 
	 * (Sunday → yadnuS).
	 * 
      2)Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, 
print the character in the middle of the String.*/

//------------------------------------
    String day="Sunday";

    for(int i=day.length()-1; i>=0; i--) {
   
    System.out.print(day.charAt(i)+" ");
  } System.out.println(); 

//-------------------------------------

Scanner input = new Scanner(System.in);
System.out.println("Enter a string please :");
String text = input.nextLine();
if (!text.isEmpty()) {
	if (text.length() % 2 == 1 && text.length() >= 3) {
		
		System.out.println(text.charAt((text.length()) / 2));
		
	} else {
			System.out.println("Even number of characters");}
	}






}
}
