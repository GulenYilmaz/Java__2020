package syntax.class25__Interface;

public interface Drivable {
	//compiler by default adds public static final 
	boolean MOVE_FAST=true; //-->constant variables = final variables
	
	//compiler by default adds public abstract 
	void drive();
	//public abstract void drive1();---> if do not write public abstract compiler can give for us automatically
}

abstract class Vehicles{
	
	abstract void stop();
}

//achieving multiple inheritance
class Cars extends Vehicles implements Drivable {

	@Override
	public void drive() {  //---> we must add public , we can not reduce access modifiers
		System.out.println("Car drives");
	}

	@Override
	void stop() {
		System.out.println("Car stops");
	}
}
