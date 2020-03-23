package syntaxclass12;

public class Task4 {

	public static void main(String[] args) {
		/*4 Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 * 
		 */
		System.out.println("-----------1--------------");
		String sunday="lets make a grill today";
		
		String [] day=sunday.split(" ");
		
		for(String gril:day) {
			System.out.print(gril);
		}System.out.println();
	
		
		
		System.out.println("-----------2--------------");	
		/*5)  Create a String that should be combination of letters, 
		 * numbers and special characters. 
		 * Find out how many alpha characters 
		 * are there in the String.*/
		
		String combination="lets make a @#$%^&* grill today 123456 ";
		String com=combination.replaceAll("[^A-Za-z]", "");
		System.out.println(com);
	
		
		
	
		
		System.out.println("-----------3--------------");
		/* 6) you have a String a=“Is it saturday? Is it raining? 
		 * Do we have a Java Class today?” 
		 * How would you find out how many sentences are in that String?
		 * 
		 */
  String a="Is it saturday? Is it raining?  Do we have a Java Class today?"; 
	
	
	String[]  sentences=a.split("\\?");
	for(String sentence:sentences) {
		System.out.print(sentence);
		System.out.println();
	
	
	}
}
}
