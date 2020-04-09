package syntax.class15__Methods_In_Java;

public class Task6Prime {

	//Write a method to return whether given number is prime or not?
	
	
	public boolean isPrime() {
		
		int a=2;
		boolean isPrime=true;
		if (a>1) {
			for(int i=2; i<a; i++) {
				if(a%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		
	}return isPrime;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Task6Prime obj= new Task6Prime();
		boolean primeNumber=obj.isPrime();
		System.out.println("number is prime : "+primeNumber);
		
		
		
	}

}
