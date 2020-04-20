package syntax.class29__Set__Collection_MapIntro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collections__and__Objects__UtilyClass__Sort {

	public static void main(String[] args) {
		//how to remove duplicates from ArrayList
		// --->to change List to Set 
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");

		Set<String> ss=new LinkedHashSet<>();
		ss.addAll(aList);
		System.out.println(ss);
		ss.add("Alijon");
		ss.add("Usman");
		
		//how to get only 1 value from set?
		// to change Set to the List, we can use get based on the index
		if(ss.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}
		
		//1 convert to list
		List<String> list=new ArrayList<>(ss);
		String name=list.get(4);
		System.out.println(name);
		list.add("Jane");
		list.add("Jane");
		list.add("Jane");
		System.out.println(list);
		
		
		System.out.println("------Array utility class------");
		//2 convert to array
		Object[] array=ss.toArray();// once array e donusturduk sonra da Arrays class ile cagirdik 
		System.out.println(array[5]);
		//Arrays is a utility class that have methods to work with arrays
		Arrays.sort(array);
		
		
		System.out.println("------Collection utility class------");
		//to sort elements of any collection
		//Collections is a utility class that have methods to work with collections
		Collections.sort(list);
		System.out.println(list);
		
	}
}
