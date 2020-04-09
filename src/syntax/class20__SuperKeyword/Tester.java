package syntax.class20__SuperKeyword;

public class Tester extends ScrumTeam{
	boolean code;
	void test() {
		System.out.println("Testers are testing codes is working or not  "+code);
	}
	
	
	
	
	
	public static void main(String[] args) {
		ScrumTeam obj= new ScrumTeam();
		
		obj.ceremonies="meeting ";
		obj.empNumber=123;
		obj.salary=123000;
		
		System.out.println("Employee s number is "+obj.empNumber+" and salary is "+obj.salary);
		
		obj.attendMeetings();
		obj.getPaid();
	}

}
