package syntax.class27__Collections_List_ArrayList;
/*
 * hw create food class that will have 3 undefined methods and it will have 4 subclasses;
		//create a collection of food and using 3 ways execute methods
		
 */
public abstract class homework2Food {

	String name;
	homework2Food (String name){
		this.name=name;
	}
	public abstract void cookable();
	
	public abstract void washable();
	
	public abstract void peelable();
	
	
}
class fruit extends homework2Food {

	fruit(String name) {
		super(name);
	
	}

	@Override
	public void cookable() {
System.out.println(name+" is not cookable.");		
	}

	@Override
	public void washable() {
System.out.println(name+" is not washable.");		
	}

	@Override
	public void peelable() {
System.out.println(name+" is peelable.");		
	}
	
}class veggies extends homework2Food {

	veggies(String name) {
		super(name);
	
	}

	@Override
	public void cookable() {
	System.out.println(name+" is cookable.");
		
	}

	@Override
	public void washable() {
		System.out.println(name+" is  washable.");		
		
	}

	@Override
	public void peelable() {
        System.out.println(name+" is not peelable. ");		
	}
}
class Beans extends homework2Food {

	Beans(String name) {
		super(name);
	
	}

	@Override
	public void cookable() {
System.out.println(name+" is cookable.");		
	}

	@Override
	public void washable() {
	System.out.println(name+" is washable.");
		
	}

	@Override
	public void peelable() {
System.out.println(name+" is not peelable.");		
	}}

class Deli extends homework2Food {

	Deli(String name) {
		super(name);
	
	}

	@Override
	public void cookable() {
System.out.println(name+" is cookable.");		
	}

	@Override
	public void washable() {
System.out.println(name+" is washable.");		
	}

	@Override
	public void peelable() {
System.out.println(name+" is not peelable.");		
	}}




