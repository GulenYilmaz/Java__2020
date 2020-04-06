package syntax.class21wed;


/*Create 1 class with a private method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result.
 */

public class Task5 {

	int number;
	
	private  void num(int a, int b) {
		System.out.println(a*b);
	}
    
	private  void num(int a, int b, int c) {
		System.out.println(a*b*c);
	} 
	
    private  void num(int a) {
    	System.out.println(a);
    }
    

	
public static void main(String[] args) {
	 Task5 obj5=new Task5 ();
     obj5.num(3);
     obj5.num(4, 5);
     obj5.num(6, 7, 8);  
}
}