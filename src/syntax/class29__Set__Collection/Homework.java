package syntax.class29__Set__Collection;

import java.util.HashMap;
import java.util.Map;

/*
 * Create a map of a building. Store floor number and it is associated company name. 
 * (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
Check how many entries you have?
Update company on a 4th floor 
Remove company on the 7th floor
Print your map
 */
public class Homework {

	public static void main(String[] args) {
		
		Map<Integer,String>floor= new HashMap<>();
		floor.put(1 ,"Google");
        floor.put(2, "Syntax");
        floor.put(3 ,"Bof");
        floor.put(4, "Dentist");
        floor.put(5 ,"Doctor");
        floor.put(6, "Syntax");
        floor.put(7 ,"Google");
        floor.put(8, "Saloon");
        
        System.out.println("-------How many elements-----");
        System.out.println(floor);
        
        System.out.println("------remove 7th floor-------");
        floor.remove(7);
        System.out.println(floor);
        
        System.out.println("------update 4th floor------");
        floor.replace(4,"shoe shop");
        System.out.println(floor);
        
	}

}
