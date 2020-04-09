package syntax.class16__Variables_In_Java;

public class StaticVariableDog {

    //instance variables
	String name, size;
	int age;
	
	
	// static variables
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	
	
	//methods
	void displaydog() {
		System.out.println("dog name is  "+name+" and size "+size+ "dog and age is "+age);
		System.out.println("dog breed is  "+breed+" and it has  "+paws+ "dog and tail "+tail);
	}
	
	
	
	public static void main(String[] args) {
		
		// how to access instance variables?--> by creating an object and using referance variables
		StaticVariableDog dog1=new StaticVariableDog();
		dog1.age=5;
		dog1.name="l";
		dog1.size="small";
		dog1.displaydog();
		
		
		// how to access static variables? 
		//--> static variables belong to the class -->access by className
		System.out.println(StaticVariableDog.breed);
		System.out.println(StaticVariableDog.paws);
		
	    
		System.out.println(dog1.breed);  // access static variable in static way--->husky
		
		System.out.println("-----changing static variable----------");
		// changing value of static variable
		breed="bulldog";
		System.out.println(dog1.breed);// --->bulldog
		
		StaticVariableDog dog2=new StaticVariableDog();
		dog2.age=3;
		dog2.name="k";
		dog2.size="small";
		dog2.displaydog();
		
		StaticVariableDog dog3=new StaticVariableDog();
		dog3.age=2;
    	dog3.name="h";
		dog3.size="big";
		dog3.displaydog();
		
	}
	
}
