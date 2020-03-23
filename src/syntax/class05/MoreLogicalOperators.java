package syntax.class05;

public class MoreLogicalOperators {
public static void main(String[] args) {
	/*we hve total 7 days in a week
	 * if day is 2,3-->SDLC class
	 * if 6,7-->Java class
	 * if day 1,5-->off day
	 * if 4-->review class
	  
	 */
	int day=6;
	day=7;
	//to compare to numbers 
	if(day==2 && day==3) {
		System.out.println("Today is SDLC class");
	}else if(day==6 && day==7) {
		System.out.println("Today is Java class");
			
	}else if (day==1 && day==5) {
		System.out.println("Today is no class");
	}else if(day==4) {
		System.out.println("Today is review class with Elion");}
	else {
		System.out.println("Invalid day");
		}
	
		
	
	
	
	
	
	
	System.out.println("----using Strings-------");
		//to compare String we use .equals
		String day1="Saturday";
		
		if(day1.equals("Tuesday")|| day1.equals("Wednesday")) {
			System.out.println("Today is SDLC class");
		}else if(day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java class");
		}else if(day1.equals("Monday")|| day1.equals("Friday")) {
			System.out.println("Today is no class , it is day off");
		}else if(day1.equals("Thursday")) {
			System.out.println("Today is a review class with Elion");
		}else {
			System.out.println("invalid day");
		}
		}
		}
	


