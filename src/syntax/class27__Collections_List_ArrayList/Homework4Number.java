package syntax.class27__Collections_List_ArrayList;

import java.util.*;

/*
 * 4. Create an arrayList of even numbers from 1 to 50. 
 * Using Iterator remove any number that is divisible by 5 from that arrayList.
 */
public class Homework4Number {
public static void main(String[] args) {
	
	ArrayList <Integer>number=new ArrayList<>();
	
	for (int i=0; i<=50; i++) {
		if (i%2==0) {
			number.add(i);
			
		}
	}System.out.println(number);
	
	Iterator<Integer> num=number.iterator();
	
	while(num.hasNext()) {
		int n=num.next();
		if(n%5==0) {
			num.remove();
		}
	}System.out.println(number);
	
}
}
