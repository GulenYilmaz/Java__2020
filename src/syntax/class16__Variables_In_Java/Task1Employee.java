package syntax.class16__Variables_In_Java;

public class Task1Employee {
//	    Create a Class called Employee:
//		Create three  variables eID , salary and set the CEO to “Sumair” 
//		Create two objects of the class Employee 
//		Set the value of eID, salary for each of the objects
//		Print out the eID , salary and  CEO for each of the objects 
//	
		
		String eID;         //instance variable
		int salary;         // instance variable
		static String CEO= "Sumair";//static variable 
		
		
		
		
		
		public static void main(String[] args) {

			
			Task1Employee obj1 =new Task1Employee();//local variable
			obj1.eID="Asel";
			obj1.salary=10000;
			obj1.CEO="Sumair";
			
			Task1Employee obj2 =new Task1Employee();
			obj2.eID="Uosman";
			obj2.salary=11000;
			obj2.CEO="Sumair";
			
			
			System.out.println("Employee ID is "+obj1.eID+" Salary is "+obj1.salary+" CEO is "+obj1.CEO);
			System.out.println("Employee ID is "+obj2.eID+" Salary is "+obj2.salary+" CEO is "+obj2.CEO);
	}

}
