package syntax.class05;

import java.util.Scanner;

public class HumanExampleImproved {

	public static void main(String[] args) {
	
		
		
		
		
		
		
		// 1 - let's declare all variables
        int age;
        Scanner scan;// to import we use mac: cmd+shift+o
                        // windows : ctrl+shift+o
        // 2. capture values
        scan = new Scanner(System.in);
        
        System.out.println("Please enter you are age");
        age = scan.nextInt();
        // 3. perform verification

          String human;
        
        if (age < 3) {
            human="baby";
        } else if (age >= 3 && age <= 5) {
            human="kid";
        } else if (age >= 6 && age <= 12) {
            human="child";
        } else if (age >= 13 && age <= 19) {
            human="teenager";
        } else if (age >= 20 && age < 65) {
            human="adult";
        } else {
            human="senior";
        }
        
        System.out.println("You are "+human);
        
        if (human.equals("teenager")) {
            System.out.println("Parents good luck");
        }

	}
}
