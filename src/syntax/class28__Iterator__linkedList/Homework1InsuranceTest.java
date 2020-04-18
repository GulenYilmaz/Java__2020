package syntax.class28__Iterator__linkedList;
import java.util.*;
public class Homework1InsuranceTest {
	public static void main(String[] args) {
		Homework1Insurance car=new Car("Geogo","Lexus");
		Homework1Insurance pet=new Pet("Stagefirm","dog");
		Homework1Insurance h=new Health ("UMR");

	    ArrayList<Homework1Insurance> insurances= new ArrayList<>();		
		insurances.add(new Car("Geogo","Lexus"));
		insurances.add(new Pet("Stagefirm","dog"));
		insurances.add(new Health ("UMR"));
		
		System.out.println("------for loop-------");
		for (int i=0; i<insurances.size(); i++) {	
		insurances.get(i).getQuote();
		insurances.get(i).cancelInsurance();
		}System.out.println();
		System.out.println("------for advance loop-------");
	    for(Homework1Insurance insurance:insurances) {
	    	insurance.getQuote();
	    	insurance.cancelInsurance();}
	    System.out.println("------  iterator 1  -------");
	    Iterator<Homework1Insurance> it1=insurances.iterator();
	    while(it1.hasNext()) {
	    it1.next().cancelInsurance(); }
	    System.out.println("------  iterator 2  -------");
	    
	    Iterator<Homework1Insurance> it2=insurances.iterator();
	    while(it2.hasNext()) {
	    it2.next().getQuote();
	    
	    }}}
