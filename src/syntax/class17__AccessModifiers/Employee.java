package syntax.class17__AccessModifiers;


public class Employee {

	
	//create variables to hold:name last name title ssn
	
	public static String title;
	
	public String name;         //--->accessible everywhere             --> all country
	protected String lastName;  //--->accessible within same package    -->same country
	double salary;              //--->accessible within same package    -->same country  default
	private long ssn;           //--->accessible only within same class -->same city
	
	
	public static void method1() {
		System.out.println("I am ");
	}
	protected void method2() {
		System.out.println(" I am protected method");
	}
    void method3() {
    	System.out.println(" I am default method");
    }
    private void method4() {
    	System.out.println(" I am a private method");
    }
	
	
	public static void main(String[] args) {
		
		
	Employee emp=	new Employee();
	emp.lastName="john";
	emp.lastName="Smith";
	emp.salary=900000;
	emp.ssn=187654324;

	
	//accessing all methods
	method1();
	emp.method2();
	emp.method3();
	emp.method4();
	
	}

}
