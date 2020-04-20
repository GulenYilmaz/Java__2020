package syntax.class30__Map;
import java.util.*;

/*
 * Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.

 */
public class Task1 {
	public static void main(String[] args) {
		
	
    Map<String , String> countries=new TreeMap<>();
    countries.put("Turkey","Ankara");
    countries.put("Denmark", "Copenhagen");
    countries.put("USA", "DC");
    countries.put("UK", "London");
    
    System.out.println(countries);  // {}---> elemanlari aliyoruz call maps
    System.out.println(countries.entrySet());//[]---> objectleri aliyoruz call set collection
    
    
    
    System.out.println("---get keys ---");   
    
    Set<String>keys=countries.keySet();
   
    //--->we can use inside the for loop   keys =countries.containsKey();
    System.out.println("---get keys for loop---");
    for(String k:keys) {  //for(String k: keys =countries.containsKey()){}
    	System.out.println(k);
    }
    
    System.out.println("---get keys iterator---");
    Iterator<String>it=countries.keySet().iterator();
    while (it.hasNext()) {
    	
    	System.out.println(it.next());
    }
}
}