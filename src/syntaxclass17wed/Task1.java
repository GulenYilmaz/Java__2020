package syntaxclass17wed;



//Create a method that will accept an array as parameters and will 
//return a sum of all elements from that array. Method should be visibly only within same 
//package and accessible by the creating an instance of the class.


public class Task1 {

	int num(int [] a) {
        int sum=0;
        for (int i=0; i<a.length; i++) {
            sum+=a[i];
        }
    return sum;
    }
        public static void main(String[] args) {
        
        	Task1 num2=new Task1();
        
        	int[]num3= {10,5,4,3};
            int num4=num2.num(num3);
       
        System.out.println(num4);
        
    }
}
