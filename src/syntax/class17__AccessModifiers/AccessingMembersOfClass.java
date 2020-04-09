package syntax.class17__AccessModifiers;

public class AccessingMembersOfClass {

	
	
	
	
	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.lastName="ali";
		emp.lastName="ylnm";
		emp.salary=140000;
 
		//emp.ssn=8373626;--->CE because it is private using different class we can not reach
		// CE-->field ssn is not visiable
		
		Employee.method1();
		emp.method2();
		emp.method3();
    	//emp.method4();CE-->method4 is not visiable
	
		
	}

}
