package syntax.class29__Set__Collection_MapIntro;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		//hashset does not guarantee insertion order
		Set<String> veggies = new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("tomato");
		System.out.println(veggies);//-->[potato, cucumber, tomato, eggplant, carrot]
		                            //---> orderHashSet code
		
		
		//LinkedHashSet guarantee insertion order
		Set<String>fruits=new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomato");
		System.out.println(fruits);//--->[apple, mango, kiwi, tomato, banana]
		                           //---. order insertion (ekleme sirasi)
		
		
		//tree set stores objects in ascending order
		Set<Object> food=new TreeSet<>(veggies);// we can add using constructor or use add(veggies) too
		
		//adding duplicate objects from veggies collection
		food.addAll(veggies);
		food.addAll(fruits);
		System.out.println(food);//--->[apple, banana, carrot, cucumber, eggplant, kiwi, mango, potato, tomato]
                                 //--->order  for ascending = okunusuna gore(alfabetical)
	}
}
