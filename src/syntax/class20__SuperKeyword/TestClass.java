package syntax.class20__SuperKeyword;

public class TestClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();// --->emp object
		emp.empNumber=101;
		emp.salary=90000;
		emp.getPaid();
		System.out.println("--------");
		
		Employee.company="ABC";
		Employee.work();
		System.out.println("-------------------------------------");
		
		
		ProductOwner po=new ProductOwner();//--->PO object
		//features accessible from grand parent
		po.empNumber=123;
		po.salary=150000;
		
//po.ssn --> CE: private members of the class not available --> DO NOT PARTICIPATE  INHERITANCE
		ProductOwner.company="Syntax";
		
		//features accessible from immediate parent
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stand up";
		po.attendMeetings();
		
		System.out.println("----------------");
		//accessing own features
		po.prioritizeBacklog();//--> kendi class dakine 
		
		ProductOwner.work();   //-->Grand parents clasindaki
		Employee.work();       //-->eger alt class da static degisiklik yaparsak parent class da da degisir
	}
}
