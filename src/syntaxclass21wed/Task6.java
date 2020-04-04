package syntaxclass21wed;

/*
 * Create 1 class in which create a methods that will calculate the area (volume) of 
Rectangle
Square
Box
*/

public class Task6 {
	int a;
	int b;
	

	public void area(int a, int b) {
     this.a=a;
     this.b=b;
		System.out.println("Area of the square is "+(a*a));
		System.out.println("Area of the rectangle is "+(a*b));
	}

	public void area(int a) {
		System.out.println("Volume of the square is "+(2*(a+a)));
		System.out.println("Volume of the rectangle is "+(2*(a+b)));
	}

}
class Task6TestClass {

	
public static void main(String[] args) {

	System.out.println("------Task6-------");   
    Task6 obj6=new   Task6();
    obj6.area(5);
    System.out.println("-----");
    obj6.area(4, 6);
    
    
    
    
    
}
}
