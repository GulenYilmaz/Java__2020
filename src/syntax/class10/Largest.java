package syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// find largest element from an array
		int [] nums= {200,30, -1, 900, 56, 787};
		 nums[0]=200;
		 nums[1]=30;
		 nums[2]=-1;
		 nums[3]=900;
		 nums[4]=56;
		 nums[5]=787;
		
// 1 way		
	int largest=0;
	
	for(int i:nums) {
		
		if( i>largest)  {
			
			largest=i;
		}
	}System.out.println("The largest number is this array: "+largest);

	
	System.out.println("--------------------------");		 
//2 way		 
	int largestNum=0;	 
	for(int i=0; i<nums.length;i++) {
		if (nums[i]>largestNum) {
			largestNum=nums[i];
		}	 
		 }System.out.println("The largest number is this array: "+largestNum);
		 
		 
		 
System.out.println("--------------------------");		 
		 
//3 way
int largesT=nums[0];//200
for(int i=0; i<nums.length; i++) {
	if(nums[i]>largesT) {
		largesT=nums[i];
	}
}
System.out.println("Largest num is "+largesT);
		 
		 
		 
	}
}
