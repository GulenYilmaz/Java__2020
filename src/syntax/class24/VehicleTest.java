package syntax.class24;

public class VehicleTest {

	public static void main(String[] args) {
		
		//new Vehicle("yellow");  abstract class cannot create object
		//new Car("sedan", "yellow"); abstract class cannot create object
		
		Vehicle tesla=new Tesla("yellow", "sedan", "tesla");//upcasting
		
		
		tesla.drive();
		tesla.stop();
		tesla.brake();
		tesla.start();
		
		
		//tesla.display();CE: method is not defined in Vehicle
		// reference type do not have method we can not executed methods.
		
		
		new Toyota("red", "sedan", "toyota");  // how we can know which Parent we have
		new Toyota("blue", "sedan", "toyota");
		
		Vehicle.total(); //--->3
		Toyota.total();  //--->3
	
		
		Toyota obj = new Toyota("blue", "sedan", "toyota");
		obj.total();//--->4 all classes are extends grandparent class of abstract vehicle class  
	}
}