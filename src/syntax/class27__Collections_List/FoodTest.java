package syntax.class27__Collections_List;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		ArrayList<Food> food = new ArrayList<>();
		food.add(new fruit("Orange"));
		food.add(new veggies("Spinach"));
		food.add(new Beans("Chickpeas"));
		food.add(new Deli("meat"));
		for (Food x : food) {
			x.cookable();
			x.peelable();
			x.washable();
		}
		System.out.println("======================");
		for (int i = 0; i < food.size(); i++) {
			food.get(i).cookable();
			food.get(i).peelable();
			food.get(i).washable();
		}
		System.out.println("++++++++++++++++++++++++++");
//		Iterator<Food> xx = food.iterator();
//		while (xx.hasNext()) {
//			Food f = xx.next();
//
//			f.cookable();
//			f.peelable();
//			f.washable();
//
//		}
		
		for(Iterator<Food> xx = food.iterator();xx.hasNext();) {
			Food f=xx.next();
			f.cookable();
			f.peelable();
			f.washable();
		}
		}
	}