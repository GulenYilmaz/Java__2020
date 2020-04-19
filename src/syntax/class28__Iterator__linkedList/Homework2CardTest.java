package syntax.class28__Iterator__linkedList;
import java.util.*;
public class Homework2CardTest {
public static void main(String[] args) {
	
	Homework2Card bof =new BOF("master");
	Homework2Card akbank=new Akbank("visa");
	Homework2Card yk=new Yapikredi("discover");

   LinkedList <Homework2Card> cards=new LinkedList<>();
   cards.add(bof);
   cards.add(akbank);
   cards.add(yk);
   
   System.out.println("----- for loop ------");
    for (int i=0; i<cards.size(); i++) {
	
	cards.get(i).monthlyMaintanence();
	cards.get(i).transferFee();
	
	}
    System.out.println("----- for advance ------");
    for(Homework2Card card:cards) {
    	card.transferFee();
    	card.monthlyMaintanence();
    }
    System.out.println("-----  iterator  ------");
    Iterator <Homework2Card> it1= cards.descendingIterator();// this iterator order last to first
    while(it1.hasNext()) {
    	Homework2Card str=it1.next();
    	str.transferFee();
        str.monthlyMaintanence();
    }  
    }}
