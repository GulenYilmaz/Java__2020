package syntax.class23;
/*
 * Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 

Define common behavior within and some fields in 
parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. 
Loop through each object and execute available methods.
 */
public class Task1Computer {
    String internet;
	String   day="";
    
	
	public void access() {
		System.out.println("Every computer can access internet "+internet);
	}
	public void checkDay(String   day) {
		System.out.println("Computer can check day "+day);
	}
}
class Apple extends Task1Computer {
String day="monday";
	@Override
	public void checkDay(String   day) {
		System.out.println("Apple can check day "+day);
	}
	public void start() {
		System.out.println("Apple can start with start botton ");
	}
	
}
class Lenovo extends Task1Computer {
	
	String day="tuesday";
	@Override
	public void checkDay(String   day) {
		System.out.println("Lenovo can check day "+day);
	}
	public void voice() {
		System.out.println("Apple can start voice  ");
	}
}
class HP extends Task1Computer {
	String day="wed";
	@Override
	public void checkDay(String   day) {
		System.out.println("HP can check day "+day);
	}
	
}
class Dell extends Task1Computer {
	String day="thursday";
	@Override
	public void checkDay(String   day) {
		System.out.println("Dell can check day "+day);
	}
	
}