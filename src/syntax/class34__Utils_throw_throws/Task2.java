package syntax.class34__Utils_throw_throws;
/*
 * Create a method checkUserName that will throw a runtime exception. 
 * Method should throw an exception when entered username is less than 5 characters.
 */
public class Task2 {
	
	public static void checkUserName(String username) {
		
		if(username.length()<5) {
			throw new RuntimeException("your username is not valid or should more than 5 digets");
		}else {
			System.out.println("your username is accepted ");
		}
		
	}
	
	
public static void main(String[] args) {
	checkUserName("gulennn");
}
}
