package syntax.class04__Nested_If;

public class NestIfContinuous {

	public static void main(String[] args) {
		
		boolean allergy=true;
		boolean appleAllergy=true;
		boolean orangeAllergy=true;
		boolean kiviAllergy=false;
		
		if(allergy) {
		System.out.println("Please answer below");
		if(orangeAllergy) {
			System.out.println("Do not eat oranges");	
		}
		if(appleAllergy) {
			System.out.println("Do not eat apples");
		}
		}else {
			System.out.println("You are healthy");
		}
		
		
		

	}

}
