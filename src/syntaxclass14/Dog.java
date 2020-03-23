package syntaxclass14;

public class Dog {
	// we create our class and
    // we will be define feature of the dog
	
	String breed;
	String color;
	String name;
	int age;
	
	// this is out template
	// this is out of the main method

public static void main(String[] args) {		
// we need to execute we need main method	

	
	System.out.println("----dog1----");
		Dog dog1=new Dog();
		dog1.breed="Shih tzu";
		dog1.color="yellow";
		dog1.name="Lucy";
		dog1.age=2;
		
		// now we can rich our methods
		dog1.bark();
		dog1.bark();
		dog1.bark();
		
System.out.println("----dog1----");
		Dog dog2=new Dog();
		dog2.breed="buuldog";
		dog2.color="Black";
		dog2.name="Saly";
		dog2.age=4;
		
		// now we can rich our methods
		dog2.bark();
		dog2.bark();
		dog2.bark();
		
		

	}



// out of the main method

 void eat() {
	 System.out.println(name+" can eat");
 }
 
 void bark() {
	 System.out.println(name+" can bark");
 }
 
 void run() {
	 System.out.println(name+" can run");
 }

}
