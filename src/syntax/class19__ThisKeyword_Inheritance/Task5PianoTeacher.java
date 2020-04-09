package syntax.class19__ThisKeyword_Inheritance;

public class Task5PianoTeacher {
	String level;
	 
	 public void level1() {
		 System.out.println("Student level  is "+level);
	 }
	public static void main(String[] args) {
        Task5Teacher objPiano= new Task5Teacher();
		objPiano.name="Molly";
		objPiano.lastName="Jenn";
		objPiano.studentNumber=141;
		
System.out.println("Student name is "+objPiano.name+" student lastname is  "
+objPiano.lastName+" and student number is "+objPiano.studentNumber);
		
		objPiano.name("Sarah");
		objPiano.lastName("White",444);
	}
		
		
	}


