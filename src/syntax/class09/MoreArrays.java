package syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
		// if we add more values then we declared--->ArrayIndexOutOfBoundsException
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
	//	students[3]="Aaron";---> during run time java machine will give ArrayIndexOutOfBoundsException
	// more store and print it gives error and exception
		
	//	System.out.println(students[3]);
		
		
	// if we store less elements than we declared
	//compiler will add default values
		
	String[] inClassStudents=new String[5];
	
	inClassStudents[1]="Hichem";
	inClassStudents[2]="Tetteh";
	
	System.out.println(inClassStudents[0]);//---> null
	
	System.out.println(inClassStudents[5]);//---> it is ArrayIndexOutOfBoundsException
	// because we have 0 1 2 3 4 --> 5 spaces not 6for[5].
	
	
	
	
	
	
	
	
	
	}

}
