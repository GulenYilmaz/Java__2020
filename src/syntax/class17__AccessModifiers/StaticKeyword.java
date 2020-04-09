package syntax.class17__AccessModifiers;


public class StaticKeyword {
	
	
	
	
	//create a template for a phone
		String color;
		int memory;
		
		
		static String brand;
		static boolean touchScreen;
		
		
		
		
		
		//return type, name, parameters
		static void displayGeneralInfo() {
			System.out.println("We are building "+brand+" with touch screen = "+touchScreen);
		}//can access only static variables
		
		
		
		//instance member of the class can access all static members
		void displaySpecification() {
			System.out.println("We build phone with "+memory+brand+"GB memory in "+color+"color");
		}// you can access static members --->brand

		
		
		
		//static methods cannot access non static members of the class
//		static void displaySpecification1() {
//			System.out.println("We build phone with "+memory+"GB memory in "+color+"color");
//		}
//		--->CE
		
		
		
		
		
		public static void main(String []args) {
			
			
			brand= "iphone";
			touchScreen=true;// boolean value oldugu icicn true yada false olmasi gerekiyor
			
			//accessing instance variables through the instance of the class
			StaticKeyword obj=new StaticKeyword();
			obj.color="grey";
			obj.memory=64;
			
			// accessing static method in a static way
			displayGeneralInfo();// sadece methodun adini yazarak cagiriyoruz
			obj.displayGeneralInfo();//obj ve isim yaziyoruz
			
			
			//accessing static methods in non static way/through instance
			obj.displayGeneralInfo(); // valid but not preferance
			obj.displayGeneralInfo();
			
			
			
			
			
		}
}
