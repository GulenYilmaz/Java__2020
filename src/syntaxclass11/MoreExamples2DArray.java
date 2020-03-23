package syntaxclass11;

public class MoreExamples2DArray {

	public static void main(String[] args) {

	// lets create 2D array in which we store professions
		
		
		String [][] professions= {
			
		{"QA Tester","Developers","Product Owner","Scrum Master"},
				
		{"Math Teacher","Science Teacher","ESL Teacher"},	
		{"Dentist","Surgeon"}
		};
	// get elements using advance for loop
		
		
		for(String[] occupation: professions) {    // ----->you have  a an other single array []
			for(String title:occupation) { // assign the occupation
				System.out.print(title+" ");
			}  System.out.println();                               
		}
	
	
	}

}
