package syntax.class09__Nested_Loops_and_Arrays;

public class Task1CarMiles {

	public static void main(String[] args) {
		
		// 0|0|0|0|--> new car miles
				System.out.println("--------------------------");

				for (int x=0;x<10;x++) {
					for(int y=0; y<10; y++) {
						for (int a=0;a<10;a++) {
							for(int b=0; b<10; b++) {
							 
				System.out.println(x+"|"+y+"|"+a+"|"+b);
							}	
						}
				   }
				}
	}

}
