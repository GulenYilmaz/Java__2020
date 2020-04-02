package syntaxclass21wed;
/*Write program: userClass  that has a constructor 
 * that initializes instance variable name and mobile number. 
 * Create a subclass  userInfo that will have user address variable 
 * and it also being initialized through constructor call. 
 * Print users name, mobile number and address in userDetails method.
 *  Test your code.
 */
public class Task1userClass {

	
	
	String name;
	int number;
	
	Task1userClass(String name, int number){
		System.out.println("user name is "+name+" mobine number is "+number);
	}
	
}

//
//class UserInfo extends Task1userClass{
//	String address;
//	
//	UserInfo (String name, int number, String address){
//		super().Task1userClass;
////	}
//}