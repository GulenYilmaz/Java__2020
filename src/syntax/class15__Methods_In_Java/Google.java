package syntax.class15__Methods_In_Java;

public class Google {
    // define features such as: employees id, name, last name, salary
	// define a behavior:working, get paid, attending meeting
	
	
	int empId;
	double salary;
	String name, lastName, title;
	
	// we are writing our methods with behavior
	
	void working() // method header
		
	{              //method body
		System.out.println(title+" is working");
	}
	void getPaid() {
		System.out.println(name+" is getting paid"+salary);
	}
	void attendingMeetings() {
		System.out.println(name+" attending meetings");
	}
	
	
	public static void main(String [] args) {
System.out.println("----emp1-------first object-------");

		Google emp1=new Google();// we can access variables: empId, salary.. and methods: getPaid, working...
		emp1.empId=123;
		emp1.name="John";
		emp1.lastName="Smith";
		emp1.title="CEO";
		emp1.salary=200000;
		
		emp1.working();
		emp1.getPaid();
		emp1.attendingMeetings();

System.out.println("-------emp2-------second object----");		
		Google emp2=new Google();
		emp2.empId=124;
		emp2.name="Seyma";
		emp2.lastName="Atasoy";
		emp2.title="QA Engineer";
		emp2.salary=100000;
		
		emp2.working();
		emp2.getPaid();
		emp2.attendingMeetings();
    	//emp2.playing();  CE: define playing method in class
		
		
		
		
		
		
		
	}
	
	
	
	
}
