package syntax.class04;

public class Task0402Mortgage {

	public static void main(String[] args) {
		/*Create a Java program 
		 * and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than
		 *  4.5 user will not buy a house, 
		 *  otherwise user will consider buying. 
		 *  Once user decides to buy a house,
		 *  if price of the house is larger than 200000 than
		 *   user will take a loan, otherwise user will pay cash.
		 */
		
		
		
		double Rate=4.3;
		int Price=250000;
		
		if(Rate> 4.5) {
			System.out.println("Will not buy a house");
			
		}else 
		{System.out.println("will consider buying");}
			  if(Price>200000) {
				 System.out.println("Will take a loan");
			  }else  {
				 System.out.println("will pay cash");
			   }
		}
		
	}


