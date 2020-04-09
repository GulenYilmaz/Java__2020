package syntax.class11__StringManipulations;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*Accept username, password and confirm password from a user 
		 * and check following requirements:
1Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty�?.
2Password should be minimum 8 characters, if less → message=“Password is too short�?.
3Password cannot contain username if so, → message=“Password cannot contain username�?.
4Password should match confirmed password, if not  → message=“Passwords do not match�?.

Only after all requirements met → message “Your username and password has been created�?
		 * 
		 */
//	
//	String userName="Admin";
//	String password="12345";
//	 
//	boolean emptyName=userName.isEmpty();
// //   System.out.println(emptyName);
//    
//	boolean emptyPassword=password.isEmpty();
////	System.out.println(emptyPassword);
//	
//	System.out.println("==============1==============");
//	if(emptyName && emptyPassword) {
//		System.out.println();
//	}else {
//		System.out.println("Username and Password cannot be empty");
//	}
//	
//	
//	
//	System.out.println("==============2==============");
//	int size=password.length();
//	if(size>8) {
//			
//	}else {
//	System.out.println("Password is too short ");}
//			
//	
//	System.out.println("==============3==============");
//	boolean password1=password.contains(userName);
//	if(password1) {
//		System.out.println("Password cannot contain username ");
//	}
//    
//	
//	System.out.println("==============4==============");
//	if(password.equals("12345")) {
//        System.out.println();
//    }else {
//        System.out.println("Passwords do not match");
//    }
//	
//	

        Scanner scan;
        String username;
        String password;
        String confirmedPassword;
        scan = new Scanner(System.in);
        System.out.println("Please enter your username");
        username = scan.nextLine();
        System.out.println("Please enter your password");
        password = scan.nextLine();
        if (!(username.isEmpty() || password.isEmpty())) {
            if (password.length() >= 8) {
                if(!password.contains(username)) {
                    System.out.println("Please confirm password");
                    confirmedPassword=scan.nextLine();
                    
                    if(password.equals(confirmedPassword)) {
                        System.out.println("Your account is created");
                    }else {
                        System.out.println("Passwords are not matched");
                    }
                }else {
                    System.out.println("Password cannot contain username");
                }
            } else {
                System.out.println("Password is too short");
            }
        } else {
            System.out.println("Username and password cannot be empty");
        }

		
	}

}
