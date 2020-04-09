package syntax.class19__ThisKeyword_Inheritance;

//Write a Java program called Teacher.  
//Identify features and behavior of that Class. 
//Create 3 subclasses MathTeacher, 
//ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. 
//Test all 4 classes 


public class Task5Teacher {
String name;
String lastName;
int studentNumber;
char grade;


public void name(String name) {
	System.out.println("Student name is : "+name);
}
public void lastName (String lastName, int studentNumber) {
	System.out.println( "Student lastname is "
+lastName+" student number is "+studentNumber);
}
public char Grade(char grade) {
	return grade;
}

}
