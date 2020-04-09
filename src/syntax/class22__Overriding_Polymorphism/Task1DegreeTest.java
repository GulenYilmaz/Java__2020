package syntax.class22__Overriding_Polymorphism;

public class Task1DegreeTest {

	public static void main(String[] args) {

		Task1Degree deg= new Task1Degree();
		deg.getPrerequisite();
		
		Bachelors bg= new Bachelors();
		bg.getPrerequisite();
		
		Masters mg= new Masters();
		mg.getPrerequisite();
		
	}

}
