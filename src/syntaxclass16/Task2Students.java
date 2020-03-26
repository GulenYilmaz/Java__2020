package syntaxclass16;

public class Task2Students {
//	Create a Class called Students
//	Create three  variables studentName , studentID  and numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	
	
	public static void main(String[] args) {

		Task2Students obj1= new Task2Students();
		obj1.studentID=1234;
		obj1.studentName="Alex";
		obj1.numberOfStudents++;
		
		Task2Students obj2= new Task2Students();
		obj2.studentID=1235;
		obj2.studentName="Rex";
		obj2.numberOfStudents++;
		
		Task2Students obj3= new Task2Students();
		obj3.studentID=1235;
		obj3.studentName="Max";
		obj3.numberOfStudents++;
		System.out.println("Number of all students " +obj3.numberOfStudents++);
	
	}

}
