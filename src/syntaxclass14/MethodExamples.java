package syntaxclass14;

public class MethodExamples {

	// I want to create a method that will be greeting a person
	
	void greet() {
		System.out.println("Hello everyone");
		// we can not execute this methods
		//without main method
	}
	void greet1(String name) { // her seferinde baska bir isim yazdirmak istiyorsak
		System.out.println("Hello "+name);
	}
	
	 
	

	
public static void main(String[] args) {
		
	// how do I call this methods greet?--->first we need to 
	// create an Object of the class
	// className variableName= new ClassName();
	System.out.println("--------greet1-------------");    
	 
	MethodExamples object1= new MethodExamples();
	    object1.greet();
	   
	System.out.println("--------greet2-------------");    
	    
	    object1.greet1("Sarmet");
		object1.greet1("Faisal");
		object1.greet1("John");
		object1.greet1("Josh");
		 
	       object1.greet();// greet not need String 
	       //object1.greet1();// greet  need String --> it give a CE
	}
	
	
}
