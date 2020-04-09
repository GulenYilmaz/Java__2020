package syntax.class15__Methods_In_Java;

public class Task4DiffLanguage {

	void sayHello(String county) {
		switch(county.toLowerCase()) {
		case "russia":
			System.out.println("Privet");
			break;
		case "tajikistan":
			System.out.println("Salom");
			break;
		case "mexico":
			System.out.println("Hola");
			break;
			default:
			 System.out.println("Wrong language");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Task4DiffLanguage obj	=new Task4DiffLanguage();
		
		obj.sayHello("Russia");
		
		
		
		
		
	}

}
