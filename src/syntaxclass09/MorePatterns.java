package syntaxclass09;

public class MorePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//printing pattern 1 2 3 4 5
	    for(int i=1;i<5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j); // 1 2 3 4 5 ---> goes outer the loop and go inside
			}                       
			 System.out.println();
			 }
	
	
	    
	    
	    
	    System.out.println("----Printing Pattern----");
	
	  //printing pattern if we use i
	    for(int i=1;i<5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i); // 1 1 1 1 1 ---> goes outer the loop and go inside
			                         //2 2 2 2 2 ,  3 3 3 3 3 ,4 4 4 4 4
			}
			 System.out.println();// gelecek olan line icin alttan baslat demek
			 }
	
	   
	    
	   
	    
	    
	    System.out.println("----Printing 5 rows of 1 to 9 Pattern----");
		  
	   for(int i=1;i<=5;i++) {
		 for(int j=1;j<=9;j++) {
			 System.out.print(j+" "); 
		 }
			System.out.println();// gelecek olan line icin alttan baslat demek
	   }
	
	   
	   
	   
	   
	   
	   System.out.println("----Printing j -->5 rows of 54321 Pattern----");
		  
	   for(int i=1;i<=5;i++) {
		 for(int j=5;j>=1;j--) {
			System.out.print(j+" "); 
			}
			System.out.println(); }//--->54321 j=5 dan basliyor ve kuculuyor
	
	
	   
	   
	   System.out.println("----Printing i---> 5 rows of 55555 44444... Pattern----");
		  
	  for(int i=5;i>=1;i--) {
		for(int j=5;j>=1;j--) {
		System.out.print(i+" "); 
		}
		System.out.println(); }//--->55555 44444 33333 22222 11111
	
	
	  
}
}
