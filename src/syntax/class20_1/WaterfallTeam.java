package syntax.class20_1;

import syntax.class20__SuperKeyword.Employee;

public class WaterfallTeam  extends Employee {

	public static void main(String[] args) {
		
		WaterfallTeam wteam=new WaterfallTeam();
		Employee.company="Syntax";
		wteam.empNumber=124;// protected variables is visible to the child class in different Package
		
		//wteam.salary      // CE: default is not visible
		
	}
}