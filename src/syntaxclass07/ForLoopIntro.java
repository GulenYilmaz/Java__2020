package syntaxclass07;

public class ForLoopIntro {
public static void main(String[] args) {
	
	
	// good morning 5 times
	for(int c=1; c<6; c++) {
		System.out.println("Good morning");
	}
	
	// print numbers 1 to 10
	for(int i=1; i<=10; i++) {
		System.out.println(i);
	}
	//print number from 10 to 1
	for(int x=10; x>=10; x--) {
		System.out.println(x);
	}
	//What will be the output
	for(int i=0; i<=50; i+=5) {
		System.out.println(i);
	}
	//what is the output
	int sum=0;
	for(int i=1; i<5; i++) {
		sum=sum+i;
	}
	System.out.println("value of sum "+sum);
}
}
