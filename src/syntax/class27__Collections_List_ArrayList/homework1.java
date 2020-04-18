package syntax.class27__Collections_List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class homework1 {
public static void main(String[] args) {
		
		// store flowers into array
		Flower [] flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};

		//store flowers into ArrayList
		ArrayList<Flower> flowers=new ArrayList<>();//--->Flower type ArrayList
		
		flowers.add(new Rose("Rose"));          //---> first you can create new object and add
		flowers.add(new Tulip("Tulip"));        //---> first you can create new object and add
		flowers.add(new Sunflower("Sunflower"));//---> first you can create new object and add
		
		//flowers.add("rose");CE---> store type is String object is not Flower type
		
		System.out.println("-----------for loop--------------");
		for (int i =0; i<flowers.size(); i++) {
	    	Flower str=flowers.get(i);
	    	str.bloom();
	     	
	    }
	    System.out.println("----------iterator---------------");
	    Iterator<Flower> it=flowers.iterator();
	    while (it.hasNext()) {
	    	Flower str=it.next();
	    	str.bloom();
	    }
	    
	    
	    System.out.println("-----------advance for loop--------------");
		for (Flower flower:flowers) {
			flower.bloom();
		}
		
		
		//flowers.add("Rose");cannot add String Object into ArrayList of Flower Objects
}	
}
