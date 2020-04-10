package syntax.class25__Interface;
/*
 * We have to calculate the average 
 * of marks obtained in three subjects 
 * by student A and by student B. 
 * Create class ‘Marks’ with an abstract method 
 * ‘getPercentage’ that will be returning 
 * the average percentage of marks. 
 * Provide implementation of abstract 
 * method in classes ‘A’ and ‘B’. 
 * The constructor of student A takes
 *  the marks in three subjects as its 
 *  parameters and the marks in four subjects 
 *  as its parameters for student B. 
 * Test your code
 */
public abstract class Task2Marks {
	int math;
	int science;
	  
	 Task2Marks (int math, int science){
		  this.math=math;
		  this.science=science;}
	
	public abstract void getPercentage(); 
	
}class A extends Task2Marks{
    int ss;
    
     A(int math, int science, int ss){
    	super(math,science);
        this.ss=ss;
    }
    @Override
	public void getPercentage() {
    int total=(math+science+ss);
    double percentage=(total)/100;
    System.out.println(" Student A's percentage is "+percentage);
	}
}class B extends Task2Marks{
    int history;
    int art;
    
    B(int math, int science, int art,int history){
    super(math,science);
    this.history=history;
    this.art=art;
    }
    @Override
	public void getPercentage() {
    	int t=(math+science+history+art);
        double percent=(t)/100;
        System.out.println(" Student B's percentage is "+percent);		
	}
	
}