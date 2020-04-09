package syntax.class10__Arrays_and_2D_Arrays;

public class twoDimensinalArrays {

	public static void main(String[] args) {
//long way	
		int [][]numbers=new int [3][4];
		//1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2 row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		//3row
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
   // I want to print value 15
		System.out.println(numbers[1][2]);

		
		//short way		
	int [][] nums= {// array of 3 single dimensional arrays
			{10,20,30,40},
			{5, 10, 15, 20},
			{1,2,3,4,}
	        };
		
		System.out.println(nums[2][3]);//--->4
		System.out.println(nums[0][2]);//--->30
	}
}
