package syntax.class18__Constructor_ThisKeyword;

public class ConstructorIntro {

//	ConstructorIntro(){
//		
//		
//	}

	// to create a constructor: 1. no return type (not even void)
	// 2. name must be same as class name
	ConstructorIntro() {
		System.out.println("I am a constructor");
	}

	public static void main(String[] args) {
		// = creating an Object and calling a constructor
		ConstructorIntro obj = new ConstructorIntro();//--->1 I am a constructor

		System.out.println("Code after constructor");//--->2 Code after constructor
		// calling method
		obj.hello();// 3 Hello Class
	}

	void hello() {
		System.out.println("Hello Class");
	}
}