package syntax.class27__Collections_List_ArrayList;
/*
 * Create an arrayList of drinks. 
 * If any drink has letter “a” or “e” replace it with water. 
 */

import java.util.ArrayList;

import java.util.*;

public class homework3Drink {
public static void main(String[] args) {
	
	
	ArrayList<String> drink= new ArrayList<>();
	drink.add("water");
	drink.add("coke");
	drink.add("juice");
	drink.add("milk");
	
	
	
	//first way
	System.out.println("---------- iterator -----------");
	Iterator <String> it = drink.iterator();
	
	String dr;
	while(it.hasNext()) {
		String d=it.next();
		if(d.contains("a")|| d.contains("e")) {
			dr=d.replaceAll(d, "Water");
		}else {
			dr=d;
		}
	System.out.println(dr);
	}
	
	
	//second way
	System.out.println("---------- for loop -----------");
	for (int i=0; i<drink.size(); i++) {
		if(drink.get(i).contains("e")|| drink.get(i).contains("a")) {
			drink.set(i,"water");  //---> we can set the method with using index
		}
	}System.out.println(drink);
	
	
	//third way
	System.out.println("---------- for advance -----------");
	for(String d:drink) {
		d.toLowerCase();
		if(d.contains("a")||d.contains("e")){
			d=d.replaceAll(d, "water");
		}System.out.println(d);
		}
}
}
