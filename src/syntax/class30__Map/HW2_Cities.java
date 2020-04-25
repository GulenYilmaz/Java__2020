package syntax.class30__Map;
/*
 * Create a Map from array of cities 
 * that will sort keys in alphabetical order. 
 * As a key store the name of the city 
 * and as a value store the length of the city 
 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city . 
 */
import java.util.*;



public class HW2_Cities {
public static void main(String[] args) {
	 
	Map<String, Integer>cities=new TreeMap<>();
	
	cities.put("copenhagen", 10);
	cities.put("paris", 5);
	cities.put("london", 2);
	cities.put("DC", 13);

	System.out.println(cities);
	
	System.out.println("------------------remove for values--------------------");
	Set <String>keys=cities.keySet();
	
	Iterator<String> it=keys.iterator();
	while(it.hasNext()) {
		String key=it.next();
		if(key.length()>7) {
			it.remove();
		}
	}System.out.println(cities);
	
	
	System.out.println("------------------remove for values--------------------");
	Collection<Integer>values=cities.values();
	Iterator<Integer>it1=values.iterator();
	while(it1.hasNext()) {
		int value=it1.next();
		if (value>7) {
			it1.remove();
		}
	}System.out.println(cities);
	
}
}
