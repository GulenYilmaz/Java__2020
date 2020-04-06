package syntax.class09;

public class Homework1 {

	public static void main(String[] args) {
		/*Create an array of chars and store grades into it:
		 *  A,B,C,D,E,F. Then print a grade B 
		 * (use 2 different ways of creating an array).*/
// 1 way
		char [] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
	
// 2 way
		char [] grades1= {'A','B','C','D','E','F'};
		grades1[0]='A';
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		grades1[4]='E';
		grades1[5]='F';
		System.out.println(grades1[1]);

		
		
//getting all elements
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
System.out.println("--------printing using advanced for loop-----");	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
