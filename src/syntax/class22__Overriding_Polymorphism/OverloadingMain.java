package syntax.class22__Overriding_Polymorphism;

public class OverloadingMain {
	
	public static void main(int[] args) {
		System.out.println("Method with int array arguments");
	}
	
	public static void main(String args) {
		System.out.println("Method with String argument");
	}
	
	public static void main(String args, String args1) {
		System.out.println("Method with 2 String argument");
	}
	
	public static void main(String args, int num) {
		System.out.println("Method with 2 String argument");
	}
	
	public static void main(int num, String args) {
		System.out.println("Method with 2 String argument");
	}
	
	public static void main(String[] args) {//Java always looks for this main method with this signature
		
		System.out.println("Method with String array arguments");
		
		System.out.println("---------------");
		OverloadingMain.main("str");
		main("str");
		
		System.out.println("---------------");
		main("hello", "hi");
		//int[] arr=new int[2];
		main(new int[2]);  //--->public static void main(int[] args)
	}
	
}