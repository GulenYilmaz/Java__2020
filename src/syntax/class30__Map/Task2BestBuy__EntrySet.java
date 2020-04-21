package syntax.class30__Map;


import java.util.Map.Entry;// not include --->import java.util.*;
import java.util.*;


/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

Retrieve all keys and values from a Best Buy map using EntrySet.*/
public class Task2BestBuy__EntrySet {
public static void main(String[] args) {
	

	Map<Integer, String> iteams=new LinkedHashMap<>();
	
	iteams.put(7664847,"Printer");
	iteams.put(7664840,"TV");
	iteams.put(7984847,"Phone ");
	iteams.put(2364847,"Tablet");
	iteams.put(7344847,"adaptor");
	iteams.put(5424847,"cable");
	System.out.println(iteams);
	
	Set<Entry<Integer,String>> entries= iteams.entrySet();
	
	System.out.println("-----for loop -----");
	for(Entry<Integer,String> e: entries) {
		System.out.println(e.getValue()+e.getKey());
	}
	System.out.println("-----iterator------");
	Iterator<Entry<Integer,String>> it=entries.iterator();
	
	while(it.hasNext()) {
		
		Entry<Integer,String> ee=it.next();
		System.out.println(ee.getValue()+ee.getKey());
	}
}
}