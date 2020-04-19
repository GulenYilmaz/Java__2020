package syntax.class29__Set__Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 *Create a Set collection in which you need to add names of the countries. 
 *In this set we want all objects to be sorted in alphabetical order. 
 *Using 2 different ways retrieve all elements from set. 
 */
public class Task1 {

 	
	public static void main(String[] args) {
		Set<String> countries= new TreeSet<>();
		
		
		countries.add("Turkey");
		countries.add("Denmark");
		countries.add("UK");
		countries.add("USA");
		
		
		System.out.println("-----iterator-----");
		Iterator <String> it = countries.iterator();
		while (it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
		System.out.println("----for advance loop----");
		for(String country:countries) {
			System.out.println(country);
		}
	}
}
