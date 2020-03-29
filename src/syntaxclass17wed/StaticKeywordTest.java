package syntaxclass17wed;

public class StaticKeywordTest {

	// we want to access different class
	
	
	public static void main(String[] args) {

		//access static members of another class
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();

		
		//access instance members of another class
		StaticKeyword sk=new StaticKeyword();  // statickeyword-->sk
		sk.color="red";
		sk.memory=128;
		sk.displaySpecification();
		
		StaticKeyword sk1=new StaticKeyword();  // statickeyword-->sk
		sk1.color="red";
		sk1.memory=128;
		
		StaticKeyword sk2=new StaticKeyword();  // statickeyword-->sk
		sk2.color="red";
		sk2.memory=128;
		sk2.brand="nokia"; // brand will change all instances object
		
		
		//n
		sk2.displayGeneralInfo();
		sk1.displayGeneralInfo();
		sk.displayGeneralInfo();
		
		}

}
