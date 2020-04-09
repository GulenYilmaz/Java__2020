package syntax.class06__Swtch_Case;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean male = false;
		int age = 30;

		if( male ){
		     if( age < 20 ){
		         System.out.println("Boy");
		     } else {
		         System.out.println("Man");

		    }
		}else {

		      if( age < 20 ){
		          System.out.println("Girl");
		       }else  {
		          System.out.println("Woman");
		      }
		}
	
		float f = 75.0f;
		double d = 75.0;
		int i = 75;

		if( f == d ) {
		   if( f == i ) {
		      System.out.println("f, d and i are equal");
		    } else {
		      System.out.println("f, d are equal but i is not equal");
		    }

		} else {
		    System.out.println("f and d are not equal");
		}
		
			   float fl = 5.3f;
			   if (fl == 5.3) {
			      System.out.println("Both are equal");
			   } else {
			      System.out.println("Both are not equal");
			   }
			}
	
	}


