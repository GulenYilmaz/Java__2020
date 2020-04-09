package syntax.class07__Loops;

public class Task2 {

	public static void main(String[] args) {
/*Create a boolean variable workDay and assign true create int variable day 
 * and assign it to 1

As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”

 * 
 */
		
		boolean workDay=true;
		int day=1;
		
		while(day<6) {
		System.out.println("I need a day off any more");
		day++;
		if(day>=6) {
			System.out.println("I do not need a day off any more");
		}
		
		}
//----------------------------------------------------------------------		
		boolean workDay1=true;
		int variableDay=1;
		
		while (workDay1) {
			
			if (variableDay <6) {
			System.out.println("I need a day off");
			}
			else {
	               System.out.println("I do not need a day off anymore");
	               workDay1 =false;// to exit
	            }
	            variableDay ++;
	        }

		
		
		
		
		
		
		
		
}
}
