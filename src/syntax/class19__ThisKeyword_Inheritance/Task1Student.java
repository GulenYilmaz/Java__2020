package syntax.class19__ThisKeyword_Inheritance;

//Write program as a Student class   that has instance variables name and address. 
//Create a constructor that will initialize those variables. 
//Print name & address of given  student using displayInfo method.

public class Task1Student {

	String name;
	String address;
	
	Task1Student(String name, String address){
		
		this.name=name;
		this.address=address;
	}
   public void  displayInfo() {
	   System.out.println("Student name is "+name+" and student address is "+address);
   }
	
	
		
	
	public static void main(String[] args) {
		Task1Student obj= new Task1Student("John","New york");
			obj.displayInfo();
		
	}

}
