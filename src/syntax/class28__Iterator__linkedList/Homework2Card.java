package syntax.class28__Iterator__linkedList;
/*
 * Create a Card class that will have implemented  
 * and unimplemented methods and a constructor 
 * that will initializes credit card type.  
 * Create 3 subclasses of a Card card. 
 * Create 3 objects of different card and store them into LinkedList. 
 * Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public abstract class Homework2Card {
	String creditCardType;
	
	Homework2Card(String creditCardType){
		this.creditCardType=creditCardType;
	}
	
	public void monthlyMaintanence() {
		System.out.println(creditCardType+" does not include any monthly card fee.");
	}
    
	public abstract void transferFee() ;
}
class BOF extends Homework2Card{

	BOF(String creditCardType) {
		super(creditCardType);}
		
	public void monthlyMaintanence() {
		System.out.println(creditCardType+" does not include any monthly card fee.");
	}
	
	
	
	@Override
	public void transferFee() {
		System.out.println(creditCardType+" does not include any transferFee fee.");
		
	}
	
}
class Akbank extends Homework2Card{

	Akbank(String creditCardType) {
		super(creditCardType);}
		
	public void monthlyMaintanence() {
		System.out.println(creditCardType+" does not include any monthly card fee.");
	}
	
	
	
	@Override
	public void transferFee() {
		System.out.println(creditCardType+" does not include any transferFee fee.");
		
	}
	
}
class Yapikredi extends Homework2Card{

	Yapikredi(String creditCardType) {
		super(creditCardType);}
		
	public void monthlyMaintanence() {
		System.out.println(creditCardType+" does not include any monthly card fee.");
	}
	
	
	
	@Override
	public void transferFee() {
		System.out.println(creditCardType+" does not include any transferFee fee.");
		
	}
	
}