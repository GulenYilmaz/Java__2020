package syntax.class26__Encapsulation_Collection;

public class Recap {

	public static void main(String[] args) {
		
		int num=10;//-->primitive type , we can store a single value
		Doctor doctor=new Doctor();//-->nonprimitive type , we can store a single object
                                   //non primitive types =object types
		
		//how we can store multible value inside the single variables?
		//---> array
		int[] numbers= {10,20,30,40};//--->primitive type we can store multiple values
		Doctor[] doctors= {new Doctor(), new Doctor(), new Doctor()};//--->nonprimitive type we can store multiple objects
		
		String[] names=new String[2];
		names[0]="Vital";
		names[1]="Ghulam";
		
		// can we add some values an array?--->NO--->no manipulation on array
		System.out.println("----- ");
		//during runtime we  Java will give an exceptions because arrays are fixed in size
		//names[2]="Jawid";
		
		//Why we can not use arrays
		//To store multiple values we use arrays
		//disadvantage of array 1) array are fixed size
	    //	                    2) array do not have ready method to manipulate data-->remove, replace, add etc
		
		
		//Why we use collections
		// to overcome limitations of array , collections concepts was introduce us.
		//     1) Collections will be dynamic size
        //	   2) Collections will be ready method to manipulate with data
        //	   3) inside Collections we can store and use only objects
		
		
		
	}
}