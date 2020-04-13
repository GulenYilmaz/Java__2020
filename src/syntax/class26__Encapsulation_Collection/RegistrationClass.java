package syntax.class26__Encapsulation_Collection;

/*
 * Create Registration Class in which you would have variables as email, 
 * userName and password that have an access scope only within its own class. 
 * After creating an object of the class user should be able to call methods 
 * and in each method separately pass values to set users email, username and password. 


Requirements: 

A)Valid email consider to be only yahoo
B)Valid userName and password cannot be empty and should be of length larger 
than 6 characters. Also valid password cannot contain userName.
 */
public class RegistrationClass {

	private String email;
	private String userName;
	private String password;

	public String getEmail() {

		return email;}

	public String getUserName() {

		return userName;}

	public String getPassword() {

		return password;}

	
	public void setEmail(String email) {

		if (email.endsWith("@yahoo.com")) {
		this.email = email;
		}else{System.out.println("please use only yahoo account");}
	    }

	
	public void setUserNameuser(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
		this.userName = userName;
		}else{System.out.println("user name can not be empty and length should be more than 6 characters");}
	    }

	
	public void setPassword(String password) {
		if (!password.isEmpty()) {
		if (password.length() > 6) {
		if (!password.contains(userName)) {
		this.password = password;
				
		}else{System.out.println("password can not contain username");}
		}else{System.out.println("password is too short");}
		}else{System.out.println("password can not be empty");}
	    }
			
}


