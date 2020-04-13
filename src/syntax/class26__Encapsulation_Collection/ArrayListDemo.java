package syntax.class26__Encapsulation_Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create an arrayList with names
		
		ArrayList<String> arrayList=new ArrayList<>();//ArrayList<>  --> we create a object 
		                  //arrayList-->assign the variables 
		//-->ArrayList type 
		
		
		
		//adding String Object into arrayList
		arrayList.add("John");
		arrayList.add("Gulbahar");
		
		
		
		//access element from arrayList we can use-------------->get(index);
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		
		//arrayList is dynamic array , we can use anything anytime
		arrayList.add("Jane");
		arrayList.add("James");
		
		
		//how to get number of elements inside arrayList? 
		//How many elements?------------------------------------->size();
		int size=arrayList.size();
		System.out.println(size);
		
		
		
		arrayList.add("Hichem");
		System.out.println(arrayList.size());
		
		arrayList.remove("John");
		System.out.println(arrayList.size());
		
		arrayList.add("Hichem");
		System.out.println(arrayList);
		
		
		// we can change elements with ------------------------->set(index, elements);
		arrayList.set(1, "Ahmed");
		System.out.println(arrayList);
		
		
		
		
		//how to retrieve values from arrayList 1 by 1?
		for(int i=0; i<arrayList.size(); i++) {
			String element=arrayList.get(i);
			System.out.println(element);
		}
		
		
		
		System.out.println("------------------------");
	
		for(String str: arrayList) {
			System.out.println(str);
		}
		
		
		
		
		
}
}