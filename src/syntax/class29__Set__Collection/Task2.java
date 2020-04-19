package syntax.class29__Set__Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Create a Set of cities in which you want to make sure that insertion order is maintained. 
 * Using Iterator remove any city that starts with “A”;
 */
public class Task2 {
	
	 	
		public static void main(String[] args) {
			
			Set<String> cities= new LinkedHashSet<>();
			
			
			cities.add("Kayseri");
			cities.add("Copenhagen");
			cities.add("Southampton");
			cities.add("Buffalo");
			cities.add("Detroit");
			
			Iterator<String >it=cities.iterator();
			while(it.hasNext()) {
				String str=it.next().toUpperCase();
				if (str.contains("A")) {
					it.remove();
				}
			}System.out.println(cities);
			
}
}