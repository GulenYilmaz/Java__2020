package syntax.class16__Variables_In_Java;

public class Shelter {

	public static void main(String[] args) {
		
		//access instance variables of different class
		DogInstanceVariable puppy=new DogInstanceVariable();// object and class name and instance variables
		puppy.name="Charly";
		System.out.println(puppy.name);
		
		//access static variables of different class
		System.out.println(StaticVariableDog.breed);//class name and static variable
	}
}
