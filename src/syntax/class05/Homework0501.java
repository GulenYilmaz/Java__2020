package syntax.class05;

import java.util.Scanner;

public class Homework0501 {

	public static void main(String[] args) {
		
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and
		 *  determine the grade based on the following rules: 
 if the average score >=90 → grade=A
 if the average score >= 70 and <90 → grade=B
 if the average score>=50 and <70 → grade=C
 if the average score<50 → grade=F
*/
		
	//	Scanner scan= new Scanner(System.in);
	//	String grade=null;
		
/*		System.out.println("What is your quiz score?");
		int quiz=scan.nextInt();
		
		System.out.println("What is your midTerm score?");
		int midTerm=scan.nextInt();
		
		int finalScore=((quiz+midTerm)/2);
		
		if(finalScore>=90) {
			grade="is A";
		}else if (finalScore>=70 && finalScore<90) {
			grade="is B";
		}else if(finalScore>=50 && finalScore<70) {
			grade="is C";
		}else if(finalScore<50) {
			grade="is F";
		}
		System.out.println("Your average score "+grade);
	
	System.out.println(----------other-----------);
	*/
	Scanner scan= new Scanner(System.in);
	String grade=null;
	
	System.out.println("What is your quiz score?");
	int quiz=scan.nextInt();
	
	System.out.println("What is your midTerm score?");
	int midTerm=scan.nextInt();
	
	System.out.println("What is your finalScore ");
	int finalScore=scan.nextInt();
	
	int score=((quiz+midTerm+finalScore)/3);
	if(score>=90) {
		grade="is A";
	}else if (score>=70 && score<90) {
		grade="is B";
	}else if(score>=50 && score<70) {
		grade="is C";
	}else if(score<50) {
		grade="is F";
	}
	System.out.println("Your average score "+grade);

	
	
	
	
	
	
	
	
	
	
	}

}
