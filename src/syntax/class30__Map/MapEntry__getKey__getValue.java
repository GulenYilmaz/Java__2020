package syntax.class30__Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry__getKey__getValue {

	public static void main(String[] args) {
		
		//create a map that will store month and days in a month
		Map<String, Integer> month=new LinkedHashMap<>();
		
		
		month.put("January", 31);// entry
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size());//gives number of entries
		
		System.out.println("----all entries----");
		//get all entries from a map
		
		Set<Entry<String, Integer>> entries=month.entrySet();
		
		System.out.println(entries);//--->[January=31, February=28, March=31, April=30] collection
		
		
		
		System.out.println(" -----  Using foor advance loop to go over all entry objects -----");
		//loop through all entry objects
		
		for(Entry <String, Integer>e:entries) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		
		
		System.out.println(" -----  Using iterator to go over all entry objects -----");
		//iterate through all entry objects
		Iterator<Entry<String, Integer>> it=entries.iterator();
		while(it.hasNext()) {
			//System.out.println("Key="+it.next().getKey()+"; value="+it.next().getValue());
			Entry <String, Integer>entry=it.next();
			System.out.println(entry);
			System.out.println("Key "+entry.getKey()+"== value "+ entry.getValue());
		}
	}
}