package syntax.class30__Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

abstract class Store{
	String type, name;
	public Store(String type, String name) {
		this.name=name;
		this.type=type;
	}
	public void display() {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours();
}



class Nike extends Store {
	public Nike(String type, String name) {
		super(type, name);
	}
	
	public void workingHours() {
		System.out.println(name+" works from 10 am till 6 pm");
	}
}



class Costco extends Store{
	public Costco(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works from 8 am until 8 pm");
	}
}




class Amazon extends Store{
	public Amazon(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works 24/7");
	}
}






public class UserDefinedClassInMap {

	public static void main(String[] args) {
		//we want to store stores in form 1 --> Amazon, 2 -->Costco, 3 -->Nike
		
		
		Map<Integer, Store> storeMap=new LinkedHashMap<>();
		
		
		
		storeMap.put(1, new Amazon("online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		
		System.out.println(storeMap);
		// to get an access to all methods of our Store Objects: .values(),  entrySet(), keySet(),
		
		
		
		//1. way --> get all Value Objects
		
		Collection<Store> collectionValue=storeMap.values();
		
		System.out.println("--------for loop values--------");
		for(Store store:collectionValue) {
			
			store.workingHours();//-->we want to call the methods inside the objects --->new Amazon("online", "Amazon"
			store.display();//--->thats why we just call the method directly 
			System.out.println("------------------------------");
			
			}
		
		System.out.println("=========iterator values=========");
		Iterator<Store>it1=collectionValue.iterator();
		while(it1.hasNext()) {
			Store vl=it1.next();
			System.out.println("==================================");
			vl.display();
			vl.workingHours();
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------  USING ENTRY SET -------------------");
		System.out.println("----------  USING ENTRY SET for loop -------------------");
		//2. way --> get all Entry Objects --> getValue
		
		Set<Entry<Integer, Store>> storeSet=storeMap.entrySet();
		
		for(Entry<Integer, Store> entry: storeSet) {
			
			entry.getValue().workingHours();//---> we need to access our entry-->1, new Amazon("online", "Amazon"
			entry.getValue().display();//-----> that s why we use getValue();--> to call the value
			
			System.out.println("-----------------------------");
		}
		
		System.out.println("=============== USING ENTRY SET Iterator ==============");
		Iterator<Entry<Integer, Store>> it2=storeSet.iterator();
		while(it2.hasNext()) {
			
			Entry<Integer, Store> vIt=it2.next();
			
			vIt.getValue().display();//--->we  want to get value thats why we cann get value(); method from Entry Interface
			vIt.getValue().workingHours();
			System.out.println("========================================================");
		}
		
		
		
		
		
		
		//3 .way --> get all Keys --> get value of specified key
		
		Set<Integer> keys=storeMap.keySet();
		
		System.out.println("-------get all keys------------");
		System.out.println("-------get all keys for loop----------");
		
		for(Integer kf: keys) {
			
			//storeMap.get(kf);--->map dan getKey(); cagiriyoruz yani getKey(2)-->"Amazon"-->Store type cagiriyoruz
			storeMap.get(kf).display();//--> fk bizim storeMap deki keylerimiz
			storeMap.get(kf).workingHours();
			
			System.out.println("-----------------------------");
		}
		
		
		System.out.println("=====================get keys iterator =====================");
		Iterator<Integer> it3=keys.iterator();
		while(it3.hasNext()) {
			
			Integer kf1=it3.next();
			storeMap.get(kf1).display();//--> fk1 bizim storeMap deki keylerimiz
			storeMap.get(kf1).workingHours();
			System.out.println("========================================================");
		}
		
	}
}
