package syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
	
		
      //NOT- reserve the condition
		boolean b=!true;
	    boolean val=false;
	
System.out.println(b);
System.out.println(val);

      boolean isCold=true;
      if(!isCold) {
    	  System.out.println("hello");
      }else {
    	  System.out.println("bye");
      }
	
	String day1="Monday";
	String day2="Friday";
	String day3="Tuesday";
	//if it is not monday or friday---. find me at Syntax
	if(!day3.equals("Monday")&& !day3.equals("Friday")) {
		System.out.println("Find me at Syntax");
	}
	
	if(!(day3.equals("Monday")&& day3.equals("Friday"))) {
		System.out.println("Find me at Syntax");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
