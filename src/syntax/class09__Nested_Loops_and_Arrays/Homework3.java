package syntax.class09__Nested_Loops_and_Arrays;

public class Homework3 {

	public static void main(String[] args) {
	/*Create an array of words: Java, Saturday, day, coding, is. 
	 * Print the following sentence using elements of array:
	 *  “Saturday is Java coding Day”. */
	
	String [] sentence= new String[5];
	sentence[0]="Java";
	sentence[1]="Saturday";
	sentence[2]="day";
	sentence[3]="coding";
	sentence[4]="is";
	System.out.println(sentence[1]+" "+sentence[4]+" "+sentence[0]+" "+sentence[3]+" "+sentence[2]);
	}
}
