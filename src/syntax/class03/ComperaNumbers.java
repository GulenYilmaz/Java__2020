package syntax.class03;

public class ComperaNumbers {

	public static void main(String[] args) {
		double number1=20;//if same else block write
		double number2=20;
		if(number1>number2) { 
		System.out.println("Number one is larger than number 2");	
		}else if(number1<number2) {
		System.out.println("Number one is smaller than number 2");
		}else {
			System.out.println("Numbers are equal");	
		}
		
		
		System.out.println("----------------------");
		//declare variable for a day and then based on the value we will provide output
		int day=6;
		if(day==1) {
			System.out.println("It is Monday, no class today");
		}else if(day==2) {
			System.out.println("It is Tuesday, no class today");
		}else if(day==3) {
			System.out.println("Wednesday");
		}else if(day==4) {
			System.out.println("Thursday");
		}else if(day==5) {
			System.out.println("Friday");
		}else if(day==6) {
			System.out.println("Saturday");
		}else if(day==7){
			System.out.println("Sanday");
		}else {
			System.out.println("unvalied day");
		}
		
	}

	}
