package syntax.class29__Set__Collection_MapIntro;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		// create a collection that will store only unique objects and we do not care
		// about the order
		HashSet<String> breakfast = new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("cream cheese");
		breakfast.add("eggs");
		breakfast.add("coffee");

		// how many elements in the set?
		int size = breakfast.size();
		System.out.println(size);
		
		// order is not maintained
		System.out.println(breakfast);

		// we need to retrieve an element --> not get method available-->get available inside the List collection
		// because it works with index

		//1 way
		// we can retrieve all elements! with iterator();
		Iterator<String> myIterator = breakfast.iterator();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		
		//we cannot use for loop
//		for(int i=0;i<breakfast.size(); i++) {
//			breakfast.ge     ---> because it does not work without index
//		}
		System.out.println("-------- ----------- ----------");
		
		// 2 way
		//advanced/enhanced for loop/for each loop
		for(String item:breakfast) {
			System.out.println(item);
		}
	}
}
