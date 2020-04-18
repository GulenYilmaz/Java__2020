package syntax.class27__Collections_List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	public static void main(String[] args) {
		
		//let's create an ArrayList of chocolate
		
		ArrayList<String> choco=new ArrayList<>();
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");
		
		//create ArrayList of sweets
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);//---> we can add collection
		
		System.out.println(sweets.size());//--->6
		System.out.println(sweets);//---->[ice cream, cheese cake, kinder, godiva, kit kat, snikers]
		System.out.println();
		
		
		
		//we want to iterate through the collection
		Iterator<String> it=sweets.iterator();// ---> it is our Iterator class object
	    // ---> when we want to remove inside the our collections we have to use our iterator objects
		
		System.out.println("-----iterator-----");
		while(it.hasNext()) {//------------->iterates in 1 direction
			String element=it.next();
			if(element.equals("ice cream")) {
				it.remove();
			}
		}
		System.out.println("----Arraylist after removing element---- ");
		System.out.println(sweets);
		
		
		
		
		System.out.println();
		
		
		
		//I want to get elements backwards
		for(int i=sweets.size()-1; i>=0; i--) {
			System.out.print(sweets.get(i)+";");//--->snikers; kit kat; godiva; kinder; cheese cake; cheese cake
		}
		
		//advanced for loop
		//iterates/loops we can use just one  direction
		
		for(String str: sweets) {
			System.out.println(str);
		}
	}
}