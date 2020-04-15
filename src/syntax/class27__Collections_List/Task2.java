package syntax.class27__Collections_List;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 2)Create an arrayList of words. 
 * Remove every word that ends with “e”. Use iterator
 */
public class Task2 {

	 public static void main(String[] args) {
		
		 

			ArrayList<String> greetings = new ArrayList<>();
			greetings.add("Hello");
			greetings.add("Merhaba");
			greetings.add("As-salam alaykom");
			greetings.add("Hola");
			greetings.add("Zdravstvuyte");
			Iterator<String> greetings2 = greetings.iterator();
			while (greetings2.hasNext()) {
				if (greetings2.next().endsWith("e")) {
					greetings2.remove();
				}
			}
			System.out.println(greetings);
		}
	}
