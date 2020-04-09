package syntax.class08__Loops;

public class Task0801 {

	public static void main(String[] args) {
		//write a program to calculate sum of odds and sum of even numbers
		//1 to 99
		
int sumOdd=0;
int sumEven=0;
	
for(int number=1; number<=99; number++) {
		if(number%2!=0) {
			sumOdd=sumOdd+number;
			
		}else {
			sumEven=sumEven+number;
			
		}
	}
System.out.println("Even numbers sum= "+sumEven);
System.out.println("Odd numbers sum= "+sumOdd);
	
}
}
