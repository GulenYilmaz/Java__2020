package syntax.class21wed;


/*Create a class named ‘Programming’. 
While creating an object of the class, if nothing is passed to it, 
then the message “I love programming languages” should be printed. 
If some String is passed to it, 
then in place of “programming languages” the value variable should be printed. 
Example, if we pass “Java”, then “I love Java” should be printed.*/


public class Task3Programming {

	String pass;
	
	Task3Programming(String pass){
		this.pass=pass;
		System.out.println("I love programming languages");
	}
	
	
}class Programmingtest {
	public static void main(String[] args) {
		
	Task3Programming obj= new Task3Programming("Java");
              
	
	}
}
