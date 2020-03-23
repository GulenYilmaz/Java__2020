package syntax.class04;

public class NestedIf {
	public static void main(String[] args) {
		
		
		int date =13;
		boolean isFriday=true;
		
		
		
		if (date==13) {
			
			System.out.println(" it is friday");
			if ( isFriday) {
				System.out.println("watch a scary movie");
			}else {
				System.out.println("I ll Watch a comedy");
			}
		
		}else {
			System.out.println("Watch a comedy");
		}
	}


}
