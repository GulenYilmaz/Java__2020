package syntax.class14__Class_and_Objects;

public class Task1Store {

	
// create an object from phone class
//instance phone class
	
	public static void main(String[] args) {
		
		
		//new Task1Phone();---> create an object of Phone
		// iphone ---> variable/referance variable
		// Task1Phone ---> type of variable
		
		
		Task1Phone iphone=new Task1Phone();
		iphone.brand="Iphone";
		iphone.color="White";
		iphone.model="X Max";
		
		iphone.dial();
		iphone.text();
		iphone.pics();
		
		Task1Phone android=new Task1Phone();
		android.brand="Samsung";
		android.color="Black";
		android.model="Note10";
		
		android.dial();
		android.text();
		android.pics();
		
		Task1Phone nokia=new Task1Phone();
		nokia.brand="Nokia";
		nokia.color="Gray";
		
		nokia.model="Nokia 9";
		nokia.dial();
		nokia.text();
		nokia.pics();
	
	
	String str="Hello friends";
	str=str.replace("Hello","Welcome ");
	System.out.println(str);
	
	
	
	
	
	
	
	
	}

}
