package syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// I am going to starting actual car
		// we build individual objects
		
		// we will be start our objects
		
	Car	car1=new Car();
		car1.make="Lamnorgini";// first object
		car1.model="Gallordo";
		car1.year=2020;
		car1.color="blue";
		 // this cars has Car class features
	Car car2 =new Car();       // second object 
		car2.make="bmw";
		car2.model="m5";
		car2.year=2019;
		car2.color="pink";
		
	Car	car3=new Car();
		car3.make="toyato";// third object
		car3.model="campy";
	//	car3.speed=2020;   we did not defined it and Compiler error
		car3.color="black";
	
		
System.out.println("-------car1-------");		
	// accesing behavior / methods of Car with car1
	
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
System.out.println("-------car2-------");			
	// accesing behavior / methods of Car with car2
		
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
	//	car2.breaking();  CE method is not defined in our class
		System.out.println("--------------");		
		
		
		
		
		
		// I would like to print  bmw
		System.out.println(car2.make);
		
		// I drive pink bmw
		System.out.println("I drive "+ car2.color+ " "+car2.make);
		
		
		// create bike object
		
	    //	new Bike(); CE because we cannot create object if we do not have a class

	
//		Car2 anothercar=new Car2();
//		anothercar.drive();
//		anothercar.accelerate();
//		anothercar.makeNoise();
//	
//	
	
	
	
	
	
	
	
	
	
	
	}

}
