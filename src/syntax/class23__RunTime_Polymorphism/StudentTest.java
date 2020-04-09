package syntax.class23__RunTime_Polymorphism;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("---- Student Object and  Reference Student Type");
		Student student=new Student();
		student.study();
		student.doHomework();
		
		System.out.println("---- SyntaxStudent Object and  Reference SyntaxStudent Type");
		SyntaxStudent syntax=new SyntaxStudent();
		syntax.doHomework();
		syntax.study();
		
		syntax.accessParentOverridenMethod();// parent class daki methodu yazdirmak istersek , 
		//child class da yeni bir method yapip super keyword ile cagirabiliriz
		syntax.getJob();
		
		System.out.println("---- SyntaxStudent Object and Student Reference Type");
		Student st=new SyntaxStudent();//----> upcasting
		//syntaz student is already student 
		st.study();
		st.doHomework();

		//SyntaxStudent st1=new Student();--->down casting
	}   // every student is not syntax student , thats why we can not downcasting
}
