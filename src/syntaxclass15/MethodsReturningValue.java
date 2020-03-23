package syntaxclass15;

public class MethodsReturningValue {
	void number(int a, int b) {
		if(a>b) {
			System.out.println(a+ " is largest number.");
		}else {
			System.out.println(b+ " is the largest number");
		}
	}
	
	
	
	public static void main(String[] args) {
		
	// create a String	and based on the length of the String
	// is short or long
		
	String str="Hello my Friends";
	int length =str.length();  // this str variable inside Hello my friends// we can store now number
	 
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}
		
		
		// compare 2 numbers and then we will identify 
		//whether largest number is even or odd
		
	    // we can call the methods that we made before from it lives which class is that TAsk1Largest	
        Task1Largest obj=new Task1Largest();		
	    //	int num=obj.number(10, 20); CE since largest does not return any value
    
        MethodsReturningValue newObject=new MethodsReturningValue();
		int num=newObject.largest(12, 13);
		System.out.println(num);
		
		boolean flag=newObject.isOdd(num);
		System.out.println(flag);
		System.out.println("largest number "+num+ " is odd number: "+flag);
	}
   
	
	// we create the method that returns largest number from 2 given numbers.
	
	int largest(int a, int b) {  // void yerine int yazdik cunku bize return yapicak
		int largest;
		if(a>b) {
			largest=a;
		}else {
			largest=b;
		}
		return largest;
	}// lets call this method
	
	boolean isOdd(int num) {     // void yerine int yazdik cunku bize return yapicak
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;
		}else
			isOdd=true;
		return isOdd;
	}
	
}
