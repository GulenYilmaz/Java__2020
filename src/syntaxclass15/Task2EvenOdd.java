package syntaxclass15;

public class Task2EvenOdd {

	//Create a method that will take a number and prints 
	//whether the number is even or odd.
	
	
	void number(int x) {
		if(x%2==0) {
			System.out.println(x+ " is an even number");
		}else {
			System.out.println(x+ " is an odd number");
		}
	}
	
	
	public static void main(String[] args) {
		Task2EvenOdd num=new Task2EvenOdd();
		num.number(37);
		num.number(88);
		
	}

}
