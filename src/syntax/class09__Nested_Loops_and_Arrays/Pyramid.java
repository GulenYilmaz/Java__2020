package syntax.class09__Nested_Loops_and_Arrays;

public class Pyramid {
	public static void main(String[] args) {
		
		
		//printing triangle for depending of rows with *
	    for(int r=1;r<=4;r++) {
			
	    	for(int c=1;c<=r;c++) {
				
	    		System.out.print("*"); // --->hangi row sa o kadar bastiriyor
	    	}
			    System.out.println();
		 }
	
		
		
	  //printing triangle for depending of rows with number
	    for(int r=1;r<=5;r++) {
			
	    	for(int c=1;c<=r;c++) {
				
	    		System.out.print(c+" "); //--->12345  print ivin
	    	}
			    System.out.println();
		 }
/*1 
  1 2 
  1 2 3 
  1 2 3 4 
  1 2 3 4 5  */
		
	  //printing triangle for depending of rows with number
	    for(int r=1;r<=5;r++) {
			
	    	for(int c=1;c<=r;c++) {
				
	    		System.out.print(r+" "); //----> 1 22 333 4444 55555 ayni sayiyi bastirmak icin
	    	}
			    System.out.println();
		 }
/*1 
  2 2 
  3 3 3 
  4 4 4 4 
  5 5 5 5 5  */
		
		
		
		
		
		
		
	}
}
