package syntax.class30__Map;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Create the collection that will store 
 * single uniques Objects of a String type in which order is preserved.

Write a logic to concatenate all string from the collection.
 */
public class HW4 {
	public static void main(String[] args) {
		
	
        Set<String > s= new LinkedHashSet<>();
        
        s.add("smile");
        s.add("every");
        s.add("day");
        
        System.out.println(s);
        
System.out.println("-------iterator--------");
	Iterator<String> it=s.iterator();
	while(it.hasNext()) {
		String c=it.next();
		System.out.print(c+" ");
	}
System.out.println();
System.out.println("-------for advance--------");	
for(String c:s) {
	System.out.print(c+" ");
}
	
	}

}