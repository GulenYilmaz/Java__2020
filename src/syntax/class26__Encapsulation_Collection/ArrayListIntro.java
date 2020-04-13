package syntax.class26__Encapsulation_Collection;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//create an arraylist to store numbers
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);//autoboxing
		numbers.add(20);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers.get(2));//  ---> hangi elementi istiyorsak we can use get(index);
		System.out.println(numbers.contains(30));
		
		System.out.println(" ------ ------- -----");
		
		for(int i=0; i<numbers.size(); i++) {
			int num=numbers.get(i);//autounboxing
			System.out.println(num);
		}

		System.out.println(" ------ ------- -----");
		
		for(int num: numbers) {
			System.out.println(num);
		}
	}
}
