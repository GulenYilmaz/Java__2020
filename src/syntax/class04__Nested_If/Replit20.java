
package syntax.class04__Nested_If;

import java.util.Scanner;

public class Replit20 {

	public static void main(String[] args) {
	  
		  Scanner scan=new Scanner(System.in); 
		   
		  System.out.println("Please Enter First Name");
		  String name=scan.nextLine();
		  
		  System.out.println("Please Enter Surname");
		  String surname=scan.nextLine();
		  
		  System.out.println(name+"  "+surname);
		  
		  
		 //26  public static void main(String[] args) {
			  	Scanner inp = new Scanner(System.in);
			  	System.out.print("In:");
			//  	String name = inp.nextLine();
			  	//DO NOT CHANGE ABOVE CODE!  Write your code below
			  	
			  	if(name.equals("Chen")){
			  	  System.out.println("teacher");
			  	}else{
			  	  System.out.println("student");
			  	  
		
			  //27
		    	  Scanner input= new Scanner(System.in);
		    	  System.out.println("Please enter your age ");
		    	    
		    	    int age=input.nextInt();    	   
                   if(age>=18){
                     System.out.println("You are eligible to vote");
                        }else{
                  System.out.println("You are not eligible to vote");
 	    
			  	  //28public static void main(String [] args){
			  	  
			  	//  Scanner input=new Scanner(System.in);
			  	  
			  	  System.out.println("Please enter the length");
			  	  int l=input.nextInt();
			  	  
			  	  System.out.println("Please enter the width");
			  	  int w=input.nextInt();
			  	  
			  	  if(l!=w){
			  	    System.out.println("The shape of your object is rectangle");
			  	  }else{
			  	     System.out.println("The shape of your object is square");
			  	   }
			  	  }
			  	  //29 Scanner input=new Scanner(System.in);
                   
                   System.out.println("please enter first number");
                   int x=input.nextInt();
                   
                   System.out.println("Please enter second number");
                   int y=input.nextInt();
                   
                   if(x*y>0){
                     System.out.println("true");
                   }else{
                     System.out.println("false");
                   }
                   //31public static void main(String [] args){
                   
    //               Scanner input=new Scanner(System.in);
                   System.out.println("Is it sunny outside?");
                   boolean isSunny=input.nextBoolean();
                   
                   if(isSunny){
                   System.out.println("It is a sunny day,I should go somewhere!");
                   
                   System.out.println("What is the temperature outside?");
                   int temp=input.nextInt();
                   
                   if(temp>85){
                     System.out.println("I am going to the beach!");
                   }else {
                     System.out.println("I am going to the park!");
                   }
                     }else{
                   System.out.println("I stay home and practice Java!");
                   }
                    }
                 //32 public static void main(String [] args){
			    Scanner input=new Scanner(System.in);
			    System.out.println("Please enter your age");
			    int age=input.nextInt();
			    System.out.println("Please enter your gender: M or F");
			    String gender=input.next();
			 if(age>25){
			      if(gender.equals("F")){
			        System.out.println("Woman");
			      }else{
			      System.out.println("Man");
			 }
			 }
			  if(age<25){
			    if(gender.equals("F")){
			    System.out.println("Girl");
			    }else{
			      System.out.println("Boy");
			    }
			  }
			  
			
			
			
//33public static void main(String [] args){
//Scanner input=new Scanner(System.in);
//System.out.println("Please enter a number");
//int num=input.nextInt();
//if(num%2==0){
  System.out.println("Value is even");
// if(num>1000){
    System.out.println("Even value is large");
 // }else{
    System.out.println("Even value is just right");
  }
 // }else{
 //   System.out.println("Value is odd");
//  }
}
  
		  
		  
//	}	   
	