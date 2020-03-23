package syntaxclass08;

public class BreakAndContinue {

	public static void main(String[] args) {


       //ones i=4---> we want to stop the loops
		System.out.println("-------------------break-------------");
		for(int i=1; i<=10; i++) {
			
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println("I am inside the loop");
			System.out.println(i);
			
		}System.out.println("I am outside of the loop");
		
		
		System.out.println("-------------------continue-------------");
		
            for(int y=1; y<=10; y++) {
			
			if(y==4) {
				System.out.println("I am skipping ineration");
				continue;
			}
			System.out.println("I am inside the loop");
			System.out.println(y);
			
		}System.out.println("I am outside of the loop");
		// I want to write a program that print numbers from 1 to 20
		//I do not want to print 5,6 and 7
		System.out.println("-----------------------");
		for(int i=1; i<21; i++) {
			if(i==5 && i==6 && i==7) {//---> tum sayilar tekrar yazilir && oldugu icin 
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-----------------------");
		for(int i=1; i<21; i++) {
			if(i==5 || i==6|| i==7) {//---> 5,6,7 haricindekiler yazilir
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-----------------------");
		// I want to write a program that print numbers from 1 to 100
	    //I do not want to print 35 - 55
		for(int i=1; i<=100; i++) {
			if(i>=35 && i<=55) {//---> 35 ile 55 arasindakiler yok 
				continue;
			}
			System.out.println(i);
		}
		
	}

}
