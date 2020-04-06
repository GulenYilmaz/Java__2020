package syntax.class21wed;

/*
 * Write program: Shape class has a constructor 
that takes the radius and has a subclass as  circle class. 
In circle class create a method to calculate 
the area of circle. Test your code*/


public class Task2Shape {

	Task2Shape (){	
	}
}
class Circle extends Task2Shape{
	static int x=3;
	int r;
	void calculate(int x, int r) {
		this.r=r;
		this.x=x;
		System.out.println("area of circle is "+(x*r*r));
	}
}


class Task2TestClass {
	
public static void main(String[] args) {

		 
System.out.println("------Task2-------");	
		Circle obj2= new Circle();
		obj2.calculate(3, 4);	 
	}
}