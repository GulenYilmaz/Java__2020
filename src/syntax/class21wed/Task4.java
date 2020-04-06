package syntax.class21wed;

/*Create 1 class with a static method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result.*/

public class Task4 {

	int number;
	
	public static void num(int a, int b) {
		System.out.println(a*b);
	}
    
	public static void num(int a, int b, int c) {
		System.out.println(a*b*c);
	} 
	
    public static void num(int a) {
    	System.out.println(a);
    }
    
}
 class Task4TestClass {

	
public static void main(String[] args) {
	 Task4 obj4=new Task4 ();
     obj4.num(3);
     obj4.num(4, 5);
     obj4.num(6, 7, 8);
}
}