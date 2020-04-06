package syntax.class17wed;



//Create a method that will accept a String as a parameter 
//and return a new String that consist only of vowels. 
//Method should be available inside the 
//class where it was declared and executed by calling it is name.

public class Task3 {

	private static String name(String word) {
        String newWord;
        newWord=word.replaceAll("[a-zA-Z, && [^aeiouAEIOU]]","");
        
    return newWord;
    }
        
	
public static void main(String[] args) {
        
	    Task3 obj=new Task3();
        String word3= obj.name("I love JAVA.");
        
        System.out.println(word3);
        
    }
}
