package syntax.class26__Encapsulation_Collection;

public class RegistrationTest {

	public static void main(String[] args) {
		
		RegistrationClass rc=new RegistrationClass();
		rc.setEmail("john@yahoo.com");
		System.out.println(rc.getEmail());//-->john@yahoo.com
	
		
		System.out.println("-----");
		rc.setUserNameuser("abcd");//-->user name can not be empty and length should be more than 6 characters
		System.out.println(rc.getUserName());//-->null
	
		
		System.out.println("-----");
		rc.setPassword("abcde");//--->password is too short
		System.out.println(rc.getPassword());//-->null
	}

}