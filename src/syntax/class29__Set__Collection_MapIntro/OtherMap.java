package syntax.class29__Set__Collection_MapIntro;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMap {

	public static void main(String[] args) {
		//store students id and corresponding name
		//LinkedHashMap - preserves the insertion order
		Map<Integer, String> lmap=new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Faisal Sakhi");
		lmap.put(102, "Ali Tarlaci");
		
		System.out.println(lmap);//-->{1000=John Smith, 1001=Jane Smith, 1002=Faisal Sakhi, 102=Ali Tarlaci}
		System.out.println("-----------------------------------------------------------------");
		
		//store objects in a form of K and V and you want to sort your keys is Ascending order
		Map<Integer, String> tmap=new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Faisal Sakhi");
		tmap.put(102, "Ali Tarlaci");
		System.out.println(tmap);//--->{102=Ali Tarlaci, 1000=John Smith, 1001=Jane Smith, 1002=Faisal Sakhi}
		                         //---> order for key type--> integer
		                         //---> always key based
		
		System.out.println("-----------------------------------------------------------------");
		//create a map of Country and population and sort countries in Alphabetical order
		
		Map<String, Integer> population=new TreeMap<>();
		population.put("USA", 330000000);
		population.put("Kazakhstan", 18000000);
		population.put("India", 1326000000);
		population.put("Afghanistan", 37000000);
		
		System.out.println(population);//--->{Afghanistan=37000000, India=1326000000, Kazakhstan=18000000, USA=330000000}
	                                   //-->key type is String --> alphabetily order
	}
}