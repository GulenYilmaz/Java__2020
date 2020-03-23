package syntax.class02;

public class ModulusOperator {

	public static void main(String[] args) {
		
		float f=12.50f;
		float f1=2.7f;
		
		
		double d=12.50;
		double d1=2.7;
		//float can hold up to 5-7 decibels
		float result=f/f1;// 4.6296296
		//double can hold up 14-15 decimals
		double result3=d/d1;//4.62962962962963
		System.out.println(result);
		System.out.println(result3);
		
		// issue 
		int i=12;
		int y=7;
		int result1=i/y;
		
		double result2=i/y;
		//modulus
		
		int v=16;
		int w=7;
		
		int mod=v%w;
		System.out.println(mod);
		
		System.out.println(result2);
		System.out.println(result1);
		// if we want integer values we can use int 1.0987 
		
		// i would like to divide 12/7
		//int num1=12.5; not possible to store decimals into java
	     //int num1=12.5;
		double num2=12;
		double num3=7;
		System.out.println(num2/num3);
		System.out.println(num2);
	}

}
