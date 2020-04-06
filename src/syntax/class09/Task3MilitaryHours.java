package syntax.class09;

public class Task3MilitaryHours {

	public static void main(String[] args) {
		

		System.out.println("--------------------------");
		//using nested loop to print military hours hours:minutes
		// inner loop control minutes
		// outer loop control hours

		for (int x=0;x<=23;x++) {
			for(int y=0; y<=59; y++) {
	//			System.out.println(x+":"+y);
			}	
		}
	
		
		
		// 0:08--> yapmak istersek if condition kullanicaz
	//	System.out.println("--------------------------");

		for (int x=0;x<=23;x++) {
			for(int y=0; y<=59; y++) {
				if( y<10) {
					System.out.println(x+":0"+y);
				}else
				System.out.println(x+":"+y);
			}	
		}
		
		
		
		
		
		
	}

}
