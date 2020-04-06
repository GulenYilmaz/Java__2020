package syntax.class22;


public class AnimalTest {

	public static void main(String[] args) {
		//Non primitive casting: upcasting
		Animal obj=new Tiger();
		obj.sleep();
		obj.eat();
		//obj.run();CE: method run() is undefined in Animal class 
		//based on the type of the object --->new tiger--->run time -------> give an executed
		//based on the referance type ------->Animal ----->compile  time--->give an access  
		
		System.out.println("--------   Accessing methods using Parent class");
		Animal animal=new Animal();
		//method only of parent class will be available
		animal.eat();
		animal.sleep();
		
		System.out.println("--------   Accessing methods using Child class");
		Tiger tiger=new Tiger();
		tiger.sleep();
		tiger.eat();
		tiger.run();
		
	}
}