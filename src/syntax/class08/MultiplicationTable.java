package syntax.class08;

public class MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * we want to create multiplication table
		 * if  1x1=1
		 * 1x2=2
		 * 1x3=3
		 * .
		 * .
		 * .
		 */
		
		int num=1;// carpacagimiz sayiyi seciyoruz
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+"*"+i+" = "+i*num);
		}
	}

}
