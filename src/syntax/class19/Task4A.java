package syntax.class19;

//Write program to inherit class A that has method printF 
//which is static and call or reuse that method into class B

public class Task4A {
static int num;


     Task4A(int num){
    	 this.num=num;
     }
	 static void printF(int num) {
		System.out.println(" I am method that printF and number is = "+num);
	}
}
