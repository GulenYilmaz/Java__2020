package syntaxclass06;

import java.util.Scanner;

public class Homework0602 {

	public static void main(String[] args) {
	/*
	 * Allow user to enter grade and then provide 
	 * explanation: A-Excellent, B-Good, C-Average, D-Bad, 
	 * any other grade -->Not Acceptable.
	 *  At the end your program should print 
	 * which grade was entered by a 
	 * user with explanation.
	 */

		
		Scanner scan=new Scanner(System.in);
		String grade;
		
		
		System.out.println("Enter your grade ");
		grade=scan.nextLine();
		
		
		switch (grade){
		case "A":
			grade="Excellent";
			break;
		case "B":
			grade="Good";
			break;
		case "C":
			grade="Average";
			break;
		case "D":
			grade="Bad";
			break;
			default:
			
		}
		
		System.out.println("Your grade is "+grade);
		
		System.out.println("-------------");
		/*Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade as A, B, C, D : ");
        char grade = scan.next().charAt(0);
        String yourNote;
        switch (grade) {
        case 'A':
            yourNote = "Excellent";
            break;
        case 'B':
            yourNote = "Good";
            break;
        case 'C':
            yourNote = "Average";
            break;
        case 'D':
            yourNote = "Bad";
            break;
            default: 
            yourNote = "Not acceptable";
        }
        System.out.println("Your grade is " + yourNote);

		 * 
		 */
		
		
		
		
	}
}
