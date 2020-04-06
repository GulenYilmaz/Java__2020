package syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		// what is the average?
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		System.out.println("Average grade is "+average);//--->81
		
System.out.println("--------------------------");
		
		System.out.println("-----creating an array of cities--------");
		
		String[] cities= {"Washington","New York","Paris","Miami","Los Angeles","Dallas","Chantilly"};
		
		// I live in Paris
		System.out.println("I live in "+cities[2]);
		
		int x=1;
		System.out.println(cities[x]);// x=1  inside the cities [1]=new york
		
		x+=3;
		System.out.println("I moved to "+cities[x]);//x=1+3=4--->Los A
		
	//	x+=4;
	//	System.out.println("I moved to "+cities[x]);//x=1+4=5--->give us error no space for 5 elements

System.out.println("-----------how many elements---------------");		
//how many elements stored inside an array
		
		int arraySize=cities.length;//7
		System.out.println("Total elements "+arraySize);//7
		
System.out.println("-----------last elements---------------");		
//how can we access last element from an array?	
		
		System.out.println(cities[arraySize-1]);//--->Chantilly

System.out.println("---------all elements-----------------");	
         //access all elements from an array
		//cities[0] cities[1] cities[2]
		
		for(int i=0; i<arraySize; i++) {
		System.out.println(cities[i]);	
		}
		
		
		
	}
}
