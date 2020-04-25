package syntax.class30__Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Create a collection of integers in which you can keep duplicates. 

Write a logic to find sum of all integers
 */
public class HW5 {
public static void main(String[] args) {
	  
	
	List<Integer > numbers=new ArrayList<>();
	
	numbers.add(50);
	numbers.add(32);
	numbers.add(10);
	numbers.add(8);
	
	System.out.println(numbers);
	
	int total=0;
	for(Integer n:numbers) {
		total=total+n;
	}System.out.println("sum of all elements = "+total);
	
	int sum=0;
	Iterator<Integer> it=numbers.iterator();
	while(it.hasNext()) {
		sum=sum+it.next();
	}System.out.println("sum of all elements = "+total);
}
}
