package syntax.class17__AccessModifiers;

//Create a method that will take a String as a parameter 
//and returns reverse String. 
//Method should be available to all classes within your projects 
//and accessible by class name.

public class Task2 {


	public String name(String word) {
        String reverse="";
        
        for (int x=word.length()-1; x>=0; x--) {
            reverse+=word.charAt(x);
        }
         return reverse;
        }
        
	
	public static void main(String[] args) {
        	
        Task2 word2=new Task2();
        String word3= word2.name("Hello");
        
        System.out.println(word3);
        
    }
}
