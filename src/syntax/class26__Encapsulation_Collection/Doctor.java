package syntax.class26__Encapsulation_Collection;
/*
 * Overloading rules:
1.      Change the # of parameters
2.      Change type of parameters
  
   Overriding Rules:
1.      There must be inheritance ( extends)
2.      Method signature (name+ parameters) and return type must be the same
3.      If you are overriding a method, you can increase the visibility (or keep it the same) but not decrease it.

   Encapsulation Rules:
1.      Make variables/ fields private
2.      Make public getters and setters to access those variables*/

public class Doctor {

	
	private long licenseID;
	private long phoneNumber;
	private String email;
	
	
	public void setEmail(String email) {
		
            if(!email.isEmpty()) {
			if(email.contains("gmail")) {
			this.email=email;
			}else {System.out.println("Email must be of gmail type");}	
            }else {System.out.println("Email cannot be empty");}
	}
	
	public String getEmail() {
		return email;
	}
}