package syntax.class25__Interface;

public abstract class Vehicle {

	static int totalVehicles;
	String color;

	Vehicle(String color) {
		this.color = color;
		totalVehicles++;
	}
    private void t() { }//-->we can have private method inside the abstract class but we can not use it
	
    public static void total() {
		System.out.println("we build " + totalVehicles);
	}

	public void drive() {
		System.out.println("Vehicle drives");
	}

	protected void stop() {
		System.out.println("Vehicle stops");
	}

	abstract void start();//---->undefined method can be default 
	
	//abstract void start(String help);---> we can overloading abstract method

	protected abstract void brake();//---->undefined method can be protected
	// private abstract void see(); //---->undefined method can NOT be private
}

class Bus extends Vehicle{
	
	Bus(String color) {
		super(color);
	}
	
	@Override
	public void brake() {
		System.out.println("bus should barke at red light camera");
	}
	
	@Override
	void start() {
		System.out.println("Bus can drive fast");
	}
}

abstract class Car extends Vehicle {
	String carType;

	Car(String color, String carType) {
		super(color);
		this.carType = carType;
	}

	public void brake() {
		System.out.println(carType + " have brakes");
	}
}

class Tesla extends Car {

	String make;

	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	public void drive() {
		System.out.println(make + " drives on autopilot");
	}

	@Override
	public void start() {
		System.out.println(make + " starts remotely");
	}

	public void display() {
		System.out.println("We have " + color + " " + make + " " + carType);
	}
}

class Toyota extends Car {

	String make;

	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	@Override
	public void start() {
		System.out.println(make + "starts keyless");
	}
}