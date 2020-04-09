package syntax.class21__SuperKeyword_Overloading;

/*
 * 
 * Write program: userClass  that has a constructor 
 * that initializes instance variable name and mobile number. 
 * Create a subclass  userInfo that will have user address variable 
 * and it also being initialized through constructor call. 
 * Print users name, mobile number and address in userDetails method.
 *  Test your code.
 */
public class Task1userClass {

	String name;
	int mobileNumber;

	Task1userClass(String name, int mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

}

class UserInfo extends Task1userClass {
	String address;

	UserInfo(String name, int mobileNumber, String address) {
		super(name, mobileNumber);
		this.address = address;
	}

	void userDetails() {

		System.out.println("user name is " + name 
				+ " mobine number is " + mobileNumber 
				+ " address is " + address);
	}

}





class Task1TestClass {

	
public static void main(String[] args) {

	
	
System.out.println("------Task1-------");
         UserInfo obj1= new UserInfo("Ali", 1863324545,"Troy");
		 obj1.userDetails();
}}
