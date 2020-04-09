package syntax.class18__Constructor_ThisKeyword;

//Write a program  that will have 4 different access levels of constructors 
//and create 3 objects of this class:
//1 - inside same class; 
//2 - from outside the class;
//3 - from different class inside different package  and observe result.


public class Constructor {

	private Constructor(int number){
		System.out.println("number is  "+number);
	}
  protected Constructor(String str){
		System.out.println("String is "+str);
	}
  Constructor(String str, int number){
	System.out.println("String is "+str+" number is  "+number);
  }
  public Constructor(){
	System.out.println("this is non argument constructor");
  }
	public static void main(String[] args) {
		
		
		Constructor onj1=new Constructor(34);
		Constructor onj2=new Constructor("nice");
		Constructor onj3=new Constructor("nice", 34);
		Constructor obj4=new Constructor();
	}
	
	
	
	
	
	
}
