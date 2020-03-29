package syntaxclass18;

public class Car {

	String make, model, color;
	int year;
	
	public void printDetails() {
		
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
	}
	
	public static void main(String[] args) {
	Car car=new Car();
	car.make="bmw";
	car.model="hg";
	car.year=2020;
	car.printDetails();//--> I have 2020 bmw hg in null color 
	// if we forget to initialize , constructor give a default for us.
		
		
		
	System.out.println("--------------");	
		Car car1=new Car();
		//we are using instance variable without assining any value
		//constructor initializes all instance variable and assign default values to them
		System.out.println(car1.year);
		
//		int doors;
//		System.out.println(doors); CE: local variables must be initialized
	}
}