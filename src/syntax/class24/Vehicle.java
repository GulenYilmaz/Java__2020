package syntax.class24;

public abstract class Vehicle {

	
	static int totalVehicles;
	String color;
	
	
	
	Vehicle(String color){
		this.color=color;
		totalVehicles++;
	}
	
	private void m() {}// abstract class can have private method
	// but we can not use  inside the child class
	
	public static void total() {
		System.out.println("we build "+totalVehicles);
	}
	
	public void drive() {
		System.out.println("Vehicle drives");
	}
	
	public void stop() {
		System.out.println("Vehicle stops");
	}
	
	public abstract void start();
	public abstract void brake();
	
	//Can abstract methods be static? NO
	//public abstract static void mi();-->CE
	
	
	//can abstract method be final? NO
	// public abstract final void m1();-->CE
	// final means defined , abstract means undefined
	
	//can abstract method be private ? NO
	//Private abstract void m3();-->CE
}





abstract class Car extends Vehicle{
	String carType;
	
	Car(String color, String carType){
		super(color);
		this.carType=carType;
	}
	
	public void brake() {
		System.out.println(carType+ " have brakes");
	}
	
}





class Tesla extends Car{
	
	String make;
	
	Tesla(String color, String carType, String make){
		super(color, carType);
		this.make=make;
	}
	//@Override
	public void drive() {
		System.out.println(make+" drives on autopilot");
	}

	@Override // implement method 
	public void start() {
		System.out.println(make+" starts remotely");
	}
	//own method
	public void display() {
		System.out.println("We have "+color+" "+make+" "+carType);
	}
}






class Toyota extends Car{
	
	String make;

	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}

	@Override
	public void start() {
		System.out.println(make+ "starts keyless");
	}	
}


