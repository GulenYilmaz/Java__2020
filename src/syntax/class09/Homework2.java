package syntax.class09;

public class Homework2 {

	public static void main(String[] args) {
		/*Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).*/
	//1 way
	String [] grupmember=new String[8];
	grupmember[0]="Abdullah";
	grupmember[1]="Ismail";
	grupmember[2]="Aaron";
	grupmember[3]="Mehmet";
	grupmember[4]="Alibay";
	grupmember[5]="Hassna";
	grupmember[6]="Shaist";
	grupmember[7]="Gulen";
	System.out.println(grupmember[7]);
	
	// 2 way
	String [] grupmember1= {"Abdullah","Ismail","Aaron","Mehmet","Alibay","Hassna","Shaist","Gulen"};
	System.out.println(grupmember1[7]);
	
	
	
	}
}
