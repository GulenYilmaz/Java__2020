package syntax.class18__Constructor_ThisKeyword;


//Write a program  that will have 4 different access levels of constructors 
//and create 3 objects of this class:
//1 - inside same class; 
//2 - from outside the class;
//3 - from different class inside different package  and observe result.


public class Task3Constructor {

	private Task3Constructor(int number){
		System.out.println("number is  "+number);
	}
    protected Task3Constructor(String str){
		System.out.println("String is "+str);
	}
    Task3Constructor(String str, int number){
	System.out.println("String is "+str+" number is  "+number);
    }
    public Task3Constructor(){
	System.out.println("this is non argument constructor");
    }
	public static void main(String[] args) {
		
		
		Task3Constructor onj1=new Task3Constructor(34);
		Task3Constructor onj2=new Task3Constructor("nice");
		Task3Constructor onj3=new Task3Constructor("nice", 34);
		Task3Constructor obj4=new Task3Constructor();
	}
	
	
	
	
	
	
}
