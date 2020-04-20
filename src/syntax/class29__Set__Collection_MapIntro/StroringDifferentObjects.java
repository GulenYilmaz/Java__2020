package syntax.class29__Set__Collection_MapIntro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StroringDifferentObjects {

	public static void main(String[] args) {
		
		Set<Insurance> hset=new HashSet<>();
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Progressive", "Dog"));
		hset.add(new Health("BCBS"));
		
		System.out.println(hset.size());
		
		Iterator<Insurance> it=hset.iterator();
		while(it.hasNext()) {
			//Insurance obj=new Car("Geico", "BMW")
			//we need to assing it to the variable because if we use it.next() --> moves to the next element
			
			Insurance obj=it.next();// this is our reference type and we assign the value and call the method
			obj.getQuote();
			obj.cancelInsurance();
			obj.method();
			
			//obj.diplay --> won't be available to insurance type because this methods belong to child class not insurance
			System.out.println("----------------------");
		}
	}
}
