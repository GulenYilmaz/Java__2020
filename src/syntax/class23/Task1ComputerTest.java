package syntax.class23;

public class Task1ComputerTest {

	public static void main(String[] args) {

		Task1Computer 	comp1=new Apple();
		Task1Computer 	comp2=new Lenovo();
		Task1Computer 	comp3=new HP();
		Task1Computer 	comp4=new Dell();
		
		
		Task1Computer [] comp= {new Apple(),
				                new Lenovo(),
				                new HP(),
				                new Dell()};
	System.out.println("----advance for loop -----");	
		for (int i=0; i<comp.length; i++) {
			comp[i].checkDay("monday");
			comp[i].access();
		}
	
	System.out.println("----for loop-----");
	    for (Task1Computer c:comp) {
		  
		  c.checkDay("");
		  c.access();
		  
	  }
	
	
	}

}
