package syntaxclass17wed;


public class StaticKeyword {
	
	
	
	
	//create a template for a phone
		String color;
		int memory;
		
		
		static String brand;
		static boolean touchScreen;
		
		
		
		
		
		//return type, name, parameters
		static void displayGeneralInfo() {
			System.out.println("We are building "+brand+" with touch screen = "+touchScreen);
		}
		void displaySpecification() {
			System.out.println("We build phone with "+memory+"GB memory in "+color+"color");
		}
		
		
		
		
		
		
		
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
			
			
			//accessing atatic methods in non static way/through instance
			obj.displayGeneralInfo(); // valid but not preferance
			obj.displayGeneralInfo();
			
			
			
			
			
		}
}
