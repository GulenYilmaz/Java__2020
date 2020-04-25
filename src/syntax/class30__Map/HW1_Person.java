package syntax.class30__Map;
/* Create a Person class with following private fields: name, lastName, age, salary. 

Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. 
In that map store personId and a Person Object. Print each object details.*/

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.*;
public class HW1_Person {

	private String name;
	private String lastName;
	private int salary;
	
	HW1_Person (String name,String lastName,int salary){
		this.lastName=lastName;
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Person name is "+name+ " lastname is "+lastName+" salary is "+salary);
	}

	
	
	
	
	public static void main(String[] args) {

		
		Map< Integer,HW1_Person> persons=new LinkedHashMap<>();
		
	persons.put(1, new HW1_Person("Elion","Limonaj",175));
	persons.put(2, new HW1_Person("Asel","A",135));
	persons.put(3, new HW1_Person("Sohil","S",145));
	
	System.out.println(persons);
	System.out.println(persons.size());
	
	
	
	
	
	System.out.println("---------1 way to get all objects details-------------");
	Collection < HW1_Person> values=persons.values();
	
	System.out.println("---------get all values for loop----");
	for(HW1_Person v:values) {
		v.display();
	}
	System.out.println("---------get all values iterator----");
    Iterator<HW1_Person>it1= values.iterator();
    while(it1.hasNext()) {
    	it1.next().display();}
    
    
    
    
    
    
    System.out.println("---------2 way to get all objects details-------------");
	Set < Integer> keys=persons.keySet();
	
	System.out.println("---------get all keys for loop----");
	for(Integer k:keys) {
		persons.get(k).display();}
	System.out.println("---------get all keys iterator----");
    Iterator<Integer>it2= keys.iterator();
    while(it2.hasNext()) {
    	Integer p=it2.next();
    	persons.get(p).display();}
    
    
    

    
    
   System.out.println("---------3 way to get all objects details-------------");
   Set <Entry<Integer, HW1_Person>>allEntries=persons.entrySet();
	
   System.out.println("---------get all entries for loop----");
   for (Entry<Integer, HW1_Person> e1:allEntries) {
	   e1.getValue().display(); }
   System.out.println("---------get all entries iterator----");
   Iterator<Entry<Integer, HW1_Person>> it3=allEntries.iterator();
   while(it3.hasNext()){
		Entry<Integer, HW1_Person> person=it3.next();
		person.getValue().display();}
	
	
	
}
}




