package syntax.class17_1;

import syntax.class17wed.Employee;

public class AccesingMemberOfDiferentClass {

	public static void main(String[] args) {
    
		
		
		Employee emp=new Employee();
        emp.name="ahmet";
        Employee.title="OA";//---> we can reach with class name to title
       
        
       //below variables not available due to restrictions 
       // emp.lastName -->protected
       // emp.salary   --->default
       //emp.ssn       --->private
        
        
        Employee.method1();
        emp.method1();// not preferable but still work
       // available --> only public other methods not available to restrictic
       // emp.method3();
       // emp.method2();
       // emp.method4();
	}

}
