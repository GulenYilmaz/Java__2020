package syntax.class15;

public class Task1Largest {

	
		//Create a method that will take 2 parameters 
		//as a numbers and prints which number is larger.
	
	
	void number(int a, int b) {
		if(a>b) {
			System.out.println(a+ " is largest number.");
		}else {
			System.out.println(b+ " is the largest number");
		}
	}
	 
	
	
	
	
	public static void main(String [] args) {
		 
		 Task1Largest num1 =new Task1Largest();
		 num1.number(24, 89);
		 num1.number(70, 4);
	 }
	
		

}
