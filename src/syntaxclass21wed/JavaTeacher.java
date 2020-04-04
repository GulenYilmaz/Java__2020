package syntaxclass21wed;

public class JavaTeacher extends Teacher{
	
	//compiler will try to create default constructor
	//and make a call inside to parent class default constructor
//	JavaTeacher(){
//		super();
//	}
	
	String certifications;
	
	JavaTeacher(String name, String lastName, String certification){

		super(name, lastName);//super always must be first line inside your constructor
		
		this.certifications=certification;
		
	}
	
	JavaTeacher(String name, String lastName){
		super(name, lastName);
	}
}
