package syntax.class34__Utils_throw_throws;
/*
 * Create a method to check age eligibility that will throw a runtime exception. 
 * Method should throw an exception age is less than 16.
 */
public class Task1 {
	
	public static void ageEligibility(int age) {
		
			if(age<16) {
				throw new RuntimeException("too young to be eligible");
			}else {
				System.out.println(" eligible");
			}
	}
		
	
	
	
	
	
public static void main(String[] args) {
	ageEligibility(15);
	ageEligibility(20);

	
	
}
}
