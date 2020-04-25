package syntax.class30__Map;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Create a Map that will store Employee name and salary. 
 * Write a logic to retrieve an employee who gets the highest salary. 
 * Output should be in the below format
John Smith=$100000
 */
public class HW3 {
public static void main(String[] args) {
	
	Map<String, Integer> employees= new TreeMap<>();
	
	employees.put("Allison", 125);
	employees.put("Neomi", 140);
	employees.put("Nora", 175);
	employees.put("Kristin", 90);
	employees.put("Melissa", 130);

 Integer maxsalary=Collections.max(employees.values());
 System.out.println("Maxsimum salary= "+maxsalary);
 
 
 Set <Entry<String, Integer>> entries= employees.entrySet();
 
 System.out.println("-------------using iterator--------------");
 Iterator<Entry<String, Integer>> it=entries.iterator();
 while(it.hasNext()){
	 Entry<String, Integer>E= it.next();
	 if(E.getValue()==maxsalary) {
		 System.out.println(E.getKey()+" has  max salary is "+E.getValue());
	 }
		 } 
 
 System.out.println("-------------using for advance loop-----");
for(Entry<String, Integer>E:entries) {
	
	if (E.getValue()==maxsalary) {
		 System.out.println(E.getKey()+" has  max salary is "+E.getValue());
	}
	
}
}
}
