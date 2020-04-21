package syntax.class30__Map;

import java.util.*;
import java.util.Map.Entry;

public class EntrySet_Entry_getKey_getValue {

	public static void main(String[] args) {
		Map <String, String> land=new TreeMap<>();
		land.put("Togo", "Lome");
		land.put("Jamaica", "Kingston");
		land.put("Iran", "Tehran");
		land.put("Peru", "Lima");
		land.put("Cuba", "Havana");
		System.out.println(land);
		
		//storing all entry objects into a set 
		Set<Entry<String,String>> allEntries=land.entrySet();//entrySet()--->Set collection
		System.out.println(allEntries);
		
		System.out.println("---loop through all entries to get a key and value");
		for(Entry<String, String> e:allEntries) {
			String key=e.getKey();
			String value=e.getValue();
			System.out.println(key.toUpperCase()+"---"+value.toLowerCase());
		}
		
		System.out.println("---iterate through all entries to get a key and value");
		Iterator<Entry<String, String>> it=allEntries.iterator();
		while(it.hasNext()) {
			Entry<String, String> e=it.next();// assign the value and use two times 
			String key$value = e.getKey()+"="+e.getValue();
			System.out.println(key$value);
		}
	}
}