package syntax.class22;
/*
 * Create a class CreditCard and define variable balance and interest. 
 * Create an instance method that will calculate interest based on the given balance. 
Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
Call the method by creating an object of each of the three classes.

 */
public class Task2CreditCard {
//public static void main(String[] args) {
//
//	Task2CreditCard obj1= new Task2CreditCard(1000);
//	Task2CreditCard obj2= new Visaa(555);
//	Task2CreditCard obj3= new AXX(1555);
//	obj1.calculate();
//	obj2.calculate();
//	obj3.calculate();
//
//}
	
	int balance;
	double interest;
	
	Task2CreditCard( int balance){
		this.balance=balance;
	}
	
	
	void calculate() {
		
		if(balance<1000) {
			interest=balance*0.1;
		}else {
			interest=0;
		}System.out.println(interest);
	}
	
}
class Visaa extends Task2CreditCard{
	
	Visaa(int balance){
		super(balance);
	}
	
void calculate() {
		
		if(balance<1000) {
			interest=balance*0.7;
		}else {
			interest=0;
		}System.out.println(interest);
	}
	
}
class AXX extends Task2CreditCard{
	AXX(int balance){
		super(balance);
	}
	
void calculate() {
		
		if(balance<1000) {
			interest=balance*0.5;
		}else {
			interest=0;
		}System.out.println(interest);
	}
	
}

