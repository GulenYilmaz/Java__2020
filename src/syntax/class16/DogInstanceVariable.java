package syntax.class16;

public class DogInstanceVariable {

	    //instance variables
		String name, size;
		int age;
		
		
		//methods
		void displaydog() {
			System.out.println("dog name is  "+name+" and size "+size+ "dog and age is "+age);		
		}
		
		
		
		public static void main(String[] args) {
			
			// how to access instance variables?
			//--> by creating an object and using referance variables
			DogInstanceVariable dog1=new DogInstanceVariable();
			dog1.age=5;
			dog1.name="l";
			dog1.size="small";
			dog1.displaydog();
			
			
			DogInstanceVariable dog2=new DogInstanceVariable();
			dog2.age=3;
			dog2.name="k";
			dog2.size="small";
			dog2.displaydog();
			
			DogInstanceVariable dog3=new DogInstanceVariable();
			dog3.age=2;
	    	dog3.name="h";
			dog3.size="big";
			dog3.displaydog();
			
		}
		
	}
