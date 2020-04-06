package syntax.class08;

public class Task0802 {

	public static void main(String[] args) {
	/*
 * Print numbers from 1 to 50 except those that are divisible by 3 */
	
		for(int i=1; i<51; i++) {
			if(i%3==0) {//---> 3 e boluneneler  yok 
				continue;
			}
			System.out.println(i);
		}
	
	}

}
