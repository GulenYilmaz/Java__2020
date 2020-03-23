package syntaxclass10;

public class RetrievingValuesFrom2Darray {

	public static void main(String[] args) {
		
		String month[][]= {
	                {"January","February","December", "Hi", "Hello"},
	                {"March","April","May"},
	                {"June","July","August", "Monkey"},
	                {"September","October"},
	                {"n"},
	                {"x"}
	                };
	       
		
		    int rows=month.length;//how many arrays or rows
		    System.out.println(rows);
	        int firstArray=month[0].length;//how many elements inside my array--->5
	        System.out.println(firstArray);
	        
	        
	        for(int i=0; i<month.length; i++) {//iterates over rows
	            
	            for(int j=0; j<month[i].length; j++) {//iterates over columns
	                
	                System.out.print(month[i][j]+" ");
	            }
	            
	            System.out.println();
	        }
	    }
	
	
		
	}


