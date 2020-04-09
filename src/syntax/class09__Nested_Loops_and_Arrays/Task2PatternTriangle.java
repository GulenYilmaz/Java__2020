package syntax.class09__Nested_Loops_and_Arrays;

public class Task2PatternTriangle {

	public static void main(String[] args) {
	
//printing triangle for depending of rows with number
	    for(int r=5;r>=1;r--) {
			
	    	for(int c=1; c<=r ;c++) {
				
	    		System.out.print(r+" "); 
	    	}
			    System.out.println();
		 }
/*5 5 5 5 5 
  4 4 4 4 
  3 3 3 
  2 2 
  1   */
	System.out.println("----------");
	
	
	for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*"+" "); 
			}
			System.out.println(); 
			}
	for(int i=4;i>=1;i--) {
		    for(int j=1;j<=i;j++) {
		    System.out.print("*"+" "); 
		    }
		    System.out.println(); 
		    }
/*
 * * 
 * * * 
 * * * * 
 * * * * *  
 * * * * 
 * * * 
 * * 
 * 
*/
	}
}
