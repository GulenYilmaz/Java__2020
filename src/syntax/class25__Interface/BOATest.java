package syntax.class25__Interface;

public class BOATest {

	public static void main(String[] args) {
		
		BOA bank=new BOA();
		bank.trust();
		bank.deposit();
		bank.financing();
		bank.giveCredit();
		bank.withdraw();

		Bank b=new BOA();
		b.trust();
		b.deposit();
		b.withdraw();
	
		Trustable t=new BOA();
		t.trust();
		
	}

}