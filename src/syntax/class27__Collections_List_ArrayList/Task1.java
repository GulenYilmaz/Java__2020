package syntax.class27__Collections_List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
1)Create an ArrayList of cars and retrieve all the values using 3 different ways.
*/

public class Task1 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> cars= new ArrayList<>();
		
		cars.add("GMC");
		cars.add("Lexus");
		cars.add("Lincon");
		cars.add("cadillac");
		
		//first way for loop
		System.out.println("------for loop -------");
	
		for(int i=0; i<cars.size(); i++) {
		String car=	cars.get(i);
			System.out.println(car);}
		
		//second way advance loop
		System.out.println("------advance for loop-------");
		
		for(String car:cars) {
			System.out.println(car);}
		
		//third way iterate
		System.out.println("------iterate -------");
		
		Iterator <String> car = cars.iterator();
		while (car.hasNext()) {
			String str=car.next();
			System.out.println(str);
		}
	}
}
