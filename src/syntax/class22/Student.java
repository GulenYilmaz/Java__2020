package syntax.class22;

/*
 * Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 

Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {

	int studentId;
	String name, lastname;
	double pay;
	
	void paid (double pay) {
		this.pay=pay;
		System.out.println("every student should pay money "+pay);}
}
class SyntaxStudent extends Student{
double pay;
	@Override
	void paid(double pay) {
		System.out.println("Syntax student should pay "+pay);}
}
class CollegeStudent extends Student{
double pay;
	@Override
	void paid(double pay) {
		this.pay=pay;
		System.out.println("College student should pay "+pay);}
}
class SchoolStudent extends Student{
double pay;
	@Override
	void paid(double pay) {
		System.out.println("School student should pay "+pay);}
}