package syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		/*Create an array on integers and 
		 * calculate the sum of all integer elements in an array*/
	
	int[] num=new int[5];
	num[0]=0;
	num[1]=1;
	num[2]=2;
	num[3]=3;
	num[4]=4;
	int sum=0;
// 1 way	
	for (int i=0; i<5; i++) {
		 sum=sum+num[i];
		
	}System.out.println(sum);
	
System.out.println("---------------------");	
//2 way
int sum2=0;
for(int number:num) {
	
	sum2=sum2+number;	
}System.out.println(sum2);
	

System.out.println("---------------------");	
	
int [] numbers = {27,43,87,322,6,32,65,85,54,7};
	int sum1=0;
	for (int j:numbers){
		sum1=sum1+j;
	}
	System.out.println("The sum of the numbers in this array is :"+ sum1);
}
	
	
	
	
	
	
	
	}

