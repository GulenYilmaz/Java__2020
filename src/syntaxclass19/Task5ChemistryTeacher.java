package syntaxclass19;

public class Task5ChemistryTeacher {
	int example;
	 public void example1() {
		 System.out.println("Example  number  is "+example);
	 }
	public static void main(String[] args) {
		Task5Teacher objCT= new Task5Teacher();
		objCT.name="Rowen";
		objCT.lastName="SAm";
		objCT.studentNumber=141;
		System.out.println("Student name is "
		+objCT.name+" student lastname is  "
		+objCT.lastName+" and student number is "
		+objCT.studentNumber);
		
		objCT.name("Farrah");
		objCT.lastName("Bluest",444);
	}

}
