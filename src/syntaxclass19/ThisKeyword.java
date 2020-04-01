package syntaxclass19;

public class ThisKeyword {

	int a,b;

	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	
	public ThisKeyword(int a, int b) {
		this.a=a;//this.a=100;
		this.b=b;
	}
	
	public void sum(int a, int b) {
		//sum of which variables am I calculating?
		System.out.println("Sum of local variables "+(a+b));
		System.out.println("Sum of instance variables "+(this.a+this.b));
	}
	
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(10, 20);//this a=10 and this b=20
		obj.sum(100, 200);
		
		System.out.println("------------------------------------------");
		ThisKeyword obj2=new ThisKeyword(); //this a=0 and this b=0
		obj2.sum(20, 40);
	}
}