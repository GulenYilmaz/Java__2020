package syntax.class28__Iterator__linkedList;
/* Create a class Insurance that will have an attribute as insuranceName 
 * and unimplemented behaviour as getQuote and
 * cancelInsurance. Create 3 subclasses Car, Pet, Health. 
 * Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
 * Create 3 objects of the sub classes and store them in ArrayList. 
 * Using for loop/advanced for loop/ iterator access all methods of the class.  */
public abstract class Homework1Insurance {
	String insuranceName;
	Homework1Insurance(String insuranceName){
		this.insuranceName=insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();
}class Car extends Homework1Insurance{
	 
	String carModel;
	Car(String insuranceName,String carModel) {
		super(insuranceName);
		this.carModel=carModel;}
	@Override
	public void getQuote() {
    System.out.println("Here is your quote from "+ insuranceName +" for your "+carModel);	}
	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your "+insuranceName+" insurance through your online account");
		}
}class Pet extends Homework1Insurance{
String petType;
	Pet(String insuranceName,String petType) {
		super(insuranceName);
	}
	@Override
	public void getQuote() {
		System.out.println("Here is your quote from "+ insuranceName +" for your "+petType);		
	}
	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your "+insuranceName+" insurance through your online account");	
	}
}class Health extends Homework1Insurance{
	Health(String insuranceName) {
		super(insuranceName);
	}
	@Override
	public void getQuote() {
		System.out.println("Here is your health quote from "+ insuranceName);	
	}
	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your "+insuranceName+" insurance through your online account");		}}
