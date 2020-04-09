package syntax.class05__Logical_Operators;

public class LogicalAndOr {

	public static void main(String[] args) {
		
	/*And && 
	 * if(true&&true)-->true
	 * if(true&&false)-->false
	 * if(false&&true)-->false
	 * if(false&&false)-->false	
	 */
		/* if declare number is between1-10-->this number is small
		 * between 11-100--->this is big number
		 * between 102-1000--->this is large number
		 */
		int num=78;
		if(num>=1 && num<=10) {
			System.out.println("This number is small");
		}else if (num>10 && num<=100) {
			System.out.println("This is big number");
		}else if(num>100 && num<=1000) {
			System.out.println("This is large number");
		}else {
			System.out.println("This number super large");
		}
		
		
		
		
		/*OR ||
		 * if(true||true)-->true
		 * if(true||false)-->true
		 * if(false||true)-->true
		 * if(false||false)-->false
		 */
		int num1=178;
		if(num1>=1 || num1<=10) {
			System.out.println("This number is small");
		}else if (num1>10 || num1<=100) {
			System.out.println("This is big number");
		}else if(num1>100 && num1<=1000) {
			System.out.println("This is large number");
		}else {
			System.out.println("This number super large");
		}
	}
}
