package syntax.class33__Exceptions;

public class InfoAboutException {
public static void main(String[] args) {
		
		String str="Hello";
		
		try {
			
			char character=str.charAt(10);// new StringIndexOutOfBoundsException();
			
		//	System.out.println(character);
		
		}catch (StringIndexOutOfBoundsException se) {
			//to get info about the exception
			//se.printStackTrace();//name, message about E, where it occurs
			//System.out.println(se);//name, message about E
			
			System.out.println("-----");
			System.out.println(se.getMessage());//--->String index out of range: 10
			
			System.out.println("---printStackTrace()----");
			se.printStackTrace();
			
			System.out.println("---sopln( se )----");
			System.out.println(se);
		}
		
		System.out.println(" -----   END OF THE PROGRAM --------");

	}
}
