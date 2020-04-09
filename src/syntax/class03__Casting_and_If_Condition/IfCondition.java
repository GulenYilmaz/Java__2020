package syntax.class03__Casting_and_If_Condition;

public class IfCondition {

	public static void main(String[] args) {
	
		// Declare a number and compare if number is larger than 100
        // if number is larger than 100 --> my number is large
        System.out.println("Starting coding");
        
        int num = 178;
        if (num > 1000) {
            System.out.println("My number is large");
        }
        
        System.out.println("End of the program");
        System.out.println("----------------------------------");
        
        int expectedHours = 15;
        int actualHours = 15;
        // if actual is more than expected --> you will love java
        
        if (actualHours >= expectedHours) {// if true go inside if block
            System.out.println("You will love Java");
        } else {// otherwise (if false) --> go inside else block
            System.out.println("You will not like Java");
        }
		System.out.println("---------------");
		
	double budget=10000;
	double carPrice=12000;
	//using if we are doing verification and selective execution
	if(budget>carPrice) {
		System.out.println("I will buy this car");
	}else {
		System.out.println("I will not buy this car, I will go learn java");
	} 
		System.out.println("I am coding after if condition");
		
		
	}
}
