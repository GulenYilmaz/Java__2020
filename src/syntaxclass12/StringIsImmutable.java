package syntaxclass12;

public class StringIsImmutable {

	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		String str2="World";
		
		
		
		
		str.concat(str2);
		//String is immutable object
		str=str.toUpperCase();
		System.out.println(str);//--->HELLO
	
	
	
	}

}
