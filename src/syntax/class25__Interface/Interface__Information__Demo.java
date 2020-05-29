package syntax.class25__Interface;

public interface Interface__Information__Demo {

	/* Interface is a blueprint of the class that achieve full of %100 abstraction.
	 * 
	 * 
	 * 
	 * inside the interface we have :
	 * 1. public static final variables(that we have to initialize them because we use final keyword)
	 * 2. public abstract methods
	 * 
	 * 3. since java 8 , interface can have static and default methods
	 * 
	 * 
	 * 
	 */
	
	//variables
	
	public static final String INTERFACE_VARIABLES="Interface variables";
	// we have to initialize , because we use final keyword
	
	
	//abstract methods 
	//first way
	public void methodone();
	//second way
	void methodtwo();//---> compiler by default add public access modifier automatically for us.
	
	
	//defined methods
	static void methodthree() {
		System.out.println("I am method three ");
	}
	default void methodfour() {// we have to add default keyword.
		System.out.println("I am method four");
	}
	/*/
	 * 
	 * why we can Use interface?
	 * using interface
	 * first-->  we can achieve %100 abstraction
	 * second-->we can achieve multiple inheritances
	 * third-->we can use defined methods 
	 * fourth--> we can use public static final variables and abstract methods
	 * 
	 * 
	 */
}


class Demo implements Interface__Information__Demo{

	@Override
	public void methodone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodtwo() {
		// TODO Auto-generated method stub
		
	}
	
}