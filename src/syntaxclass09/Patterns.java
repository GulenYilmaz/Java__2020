package syntaxclass09;

public class Patterns {
	public static void main(String[] args) {
		
		//*****---> 5 times * under the line
		for (int a=1;a<=5;a++) {
			 System.out.println("*");
		}
			 
		//*****---> 5 times * same line
		for (int a=1;a<=5;a++) {
			 System.out.print("*");
		}
		System.out.println("");			 
	   
			 
  System.out.println("--------printing pattern using nested loops------------");
  for (int a=1;a<=4;a++) {
		for(int b=1; b<=5; b++) {
		 System.out.print("*");
		}System.out.println();
  }	
}
}