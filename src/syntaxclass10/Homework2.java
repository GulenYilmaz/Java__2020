package syntaxclass10;

public class Homework2 {

	public static void main(String[] args) {
		/*Create a 2D array that first 
		 * row will contain 4 names and second row will contain grades. 
		 * Then you program should print name of the students that has A and B grade */
	
	
		String [][] school= { 
	            {"Ahmet","Aaron","Medine","Gulsum"},
	            {"A","B","C","D"}
                };
//1 way
System.out.println(school[0][0]+" has "+school[1][0]);

System.out.println(school[0][1]+" has "+school[1][3]);

System.out.println(school[0][2]+" has "+school[1][2]);

System.out.println(school[0][3]+" has "+school[1][1]);


System.out.println("-------------------------");
// 2 way
	for(int i=0; i<school[0].length; i++) {
		if (school[1][i].equals("A") || school[1][i].equals("B")) {
			System.out.println(school[0][i]+" has A or B");
		}
	}
	
	
	
	
	
	
	
	
	
	}

}
