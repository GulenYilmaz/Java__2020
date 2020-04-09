package syntax.class22__Overriding_Polymorphism;

public class StudentTest {

	public static void main(String[] args) {

		
		Student obj1= new Student();
		Student obj2= new SyntaxStudent();
		Student obj3= new CollegeStudent();
		Student obj4= new SchoolStudent();
		
		obj1.paid(78);
		obj2.paid(56);
		obj3.paid(32);
		obj4.paid(89);
	}

}
