package syntax.class21wed;

public class AllTasksTestClass {

	
public static void main(String[] args) {

	
	
System.out.println("------Task1-------");
         UserInfo obj1= new UserInfo("Ali", 1863324545,"Troy");
		 obj1.userDetails();

		 
System.out.println("------Task2-------");	
		Circle obj2= new Circle();
		obj2.calculate(3, 4);
	
		
System.out.println("------Task3-------");		
		Task3Programming obj3= new Task3Programming("Java");
        
System.out.println("------Task4-------");
		 Task4 obj4=new Task4 ();
         obj4.num(3);
         obj4.num(4, 5);
         obj4.num(6, 7, 8);
         
System.out.println("------Task6-------");   
         Task6 obj6=new   Task6();
         obj6.area(5);
         System.out.println("-----");
         obj6.area(4, 6);
         
         
         
         
         
	}
}
