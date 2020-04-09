package syntax.class10__Arrays_and_2D_Arrays;



public class RetrieveElements {

	public static void main(String[] args) {
		char [] grades= {'A','B','C','D','E','F'};
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);

		
		
//getting all elements
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}

		
System.out.println("--------printing using advanced for loop-----");	
 
     for(char grade:grades) {
	 System.out.print(grade+"");
     }	System.out.println();


     
     
     
//create an array of fruits and retrieve all elelments
String[] fruits= {"Banana", "Kivi","Apple","Mango"};

//advanced for loop , enhanced for loop , for each loop
          for(String fruit:fruits) {
	      System.out.println(fruit);
           }

System.out.println("-------------------");

//regular for loop
         for(int i=0; i<fruits.length; i++) {
	     System.out.println(fruits[i]);
         }
 
 
 System.out.println("-------------------");

 //if fruit is apple---> that is your favorite fruit
 //advanced for loop , enhanced for loop , for each loop
          for(String fruit:fruits) {
	      if(fruit.equals("Apple")) {
		  System.out.println(fruit+" is your favorite fruit");
	      }else {
		  System.out.println(fruit);
	      }
          }
          




	}

}
