package syntax.class15__Methods_In_Java;

public class Task3Palindrome {

	void palindrome(String word) {
		
    String reverse="";
	char [] array= word.toCharArray();	
		
	for(int i=word.length()-1; i>=0; i--) 
		reverse=reverse+array[i];
	
		
		
	
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("It is polindrome.");
		}else {
			System.out.println("It is not polindrome.");
		}


	}
	
	
	
	public static void main(String[] args) {
		
		Task3Palindrome str=	new Task3Palindrome();
		
		str.palindrome("madam");
	}


}