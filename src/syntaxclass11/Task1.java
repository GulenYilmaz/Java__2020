package syntaxclass11;

public class Task1 {

	public static void main(String[] args) {
		/* Create an array of cars : 
		 * american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops*/
	
	String [][] cars= {
			{"GMC","Cadillac","Lexus","Lincon"},
			{"BMW","Audi","Mercedes"},
			{"Kia","Toyayo"},
			{"I","K"}   };
	
	System.out.println("-----1 way------");
	// 1 way
	for(int r=0; r<cars.length; r++) {
		for(int c=0; c<cars[r].length; c++) {
			System.out.print(cars[r][c]+" ");
		}System.out.println();
	}
	
	System.out.println("-----2 way------");
	//2 way
	for(String [] car:cars) {
		for(String carName:car) {
			System.out.print(carName+" ");
		}System.out.println();
	}
	
	
	
	}

}
