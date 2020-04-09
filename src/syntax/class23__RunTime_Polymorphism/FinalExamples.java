package syntax.class23__RunTime_Polymorphism;

public class FinalExamples {

	final String str="I love java";
	public static final String STR="I love java";//-----> public static yazinca STR kalin yazi haline geliyor
	
	
	final void saySmth(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		FinalExamples obj=new FinalExamples();
		//obj.str="I do not like java";CE: final variables cannot be modified, degistiremeyiz
	}
}