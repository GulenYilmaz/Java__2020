package syntax.class10__Arrays_and_2D_Arrays;

public class Task1 {

	public static void main(String[] args) {
		/* Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array. */
	
	String [] animals= {"Monkey","Dog","Cat","Fish","Horse","Sheep"};
//	String [] animalss=new String[6];
	
    int size=animals.length;
    System.out.println("Animals "+size);
	
System.out.println("--------------");
	

for(int i=0; i<size; i++) {
		System.out.println(animals[i]);
	}
	
System.out.println("--------------");

for(String animal:animals) {
	System.out.println(animal);
}
	
	
	}

}
