package syntax.class07__Loops;

public class HomeWork1 {

	public static void main(String[] args) {
		/*1.Print numbers from 1 to 100 in 1 linewith space */
	for(int num1=1; num1<=100; num1++) {
		System.out.print(num1+" ");
	}
	/*2.Print numbers from 100 to 1 */
    for(int num2=100; num2>1; num2--) {
		System.out.println(num2+" ");
	}
	/*3.Print even numbers from 20 to 1 (2 ways)*/
	for(int num3=20; num3>=1; num3-=2) {//---->one way
		System.out.println(num3);
	}
	int num4=20;
	while(num4>=1) {//---->second way
		System.out.println(num4);
		num4-=2;
	}
	/*print odd numbers between 20 and 50 */
	for(int num5=19; num5<50; num5+=2) {//---->one way
		System.out.println(num5);
	}
	int num6=19;
	while(num6<50) {//---->second way
		System.out.println(num6);
		num6+=2;
	}
	
	
	
	
	
	
	
}
}
