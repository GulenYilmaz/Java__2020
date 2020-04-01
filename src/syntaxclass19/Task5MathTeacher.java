package syntaxclass19;

public class Task5MathTeacher {
 int testScore;
 
 public void test1() {
	 System.out.println(" test score is "+testScore);
 }
	public static void main(String[] args) {

		Task5Teacher objMath= new Task5Teacher();
		objMath.name="Carol";
		objMath.lastName="Brozak";
		objMath.studentNumber=888;
		
		System.out.println("Student name is "
		+ objMath.name + " student lastname is  "  + objMath.lastName
		+ " and student number is "		+objMath.studentNumber);
		
		objMath.name("Broklean");
		objMath.lastName("Ali", 777);
	}

}
