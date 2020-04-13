package syntax.class26__Encapsulation_Collection;
import java.util.ArrayList;
public class Homework {
/*Create a generic ArrayList that will store 5 names into it. 
Find out whether the given ArrayList is empty or not? 
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that */
	
	
	public static void main(String[] args) {

		ArrayList<String> names=new ArrayList<>();	
		names.add("Hassna");
		names.add("Ismail");
		names.add("Abdullah");
		names.add("Mehmet");
		names.add("Aaron");
		
		names.isEmpty();
		System.out.println(names.isEmpty());
		
		names.contains("Aaron");
		System.out.println(names.contains("Aaron"));
		
		names.size();
		System.out.println(names.size());
		
		for (int i=0; i<names.size(); i++) {
			names.get(i);
			System.out.println(names.get(i));}	
}
}
