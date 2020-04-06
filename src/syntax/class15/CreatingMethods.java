package syntax.class15;

public class CreatingMethods {

	// we want to create a method that will accept marks
	// based on the marks it will return grade(A,B,C)
	// if grade>90-->A, if grade>80-->B , if 80>grade>70-->C
	
	
	char getGrade(int a) {
		
		char grade;
		
		if(a>90) {
			grade='A';
		}else if(a<=90 && a>80) {
			grade='B';
		}else if(a<=80 && a>70) {
			grade='C';
		}else {
			grade='F';
		}
		return grade;
	}
	
	
	
	
	public static void main(String[] args) {
	
	CreatingMethods objGrade=new CreatingMethods();
		
	char g=objGrade.getGrade(85);
	System.out.println(g);	
	
	System.out.println(objGrade.getGrade(50));  // --->F
	
	// if grade is A or B--> good job, otherwise--> study more
	
	if(g=='A'|| g=='B') {
		System.out.println("Good job");
	}else {
		System.out.println("please study more");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
