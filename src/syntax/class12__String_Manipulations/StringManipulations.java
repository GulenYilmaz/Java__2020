package syntax.class12__String_Manipulations;

public class StringManipulations {

	public static void main(String[] args) {
		
		
	String str="Good mornign students!";
	char letter1=str.charAt(0);// ---> indexs 0=G
	System.out.println(letter1);	
		
	
	char letter2=str.charAt(4);// ---> indexs 4=space
	System.out.println("Letter at index 4 is "+letter1);	
	
	
	char letter5=str.charAt(4);
	System.out.println("Letter at index 4 is "+letter5+".");
	
	
	//          char someLetter=str.charAt(55);
	// RunTime Exception --> StringIndexOutOfBoundsException
	//          System.out.println(someLetter);
		
	
	
	
	
	//  get all characters 1 by 1 from a string
    char letters;
	for(int i=0; i<str.length(); i++) {
		letters=str.charAt(i);
		System.out.print(letters+" ");
	}
	

//	char someLetter=str.charAt(55);// ---> String index out of range: 55
//	System.out.println(someLetter);	--->Runtime exception StringIndexOutOfBoundsException
	
	
		System.out.println();
		System.out.println("-----indexOf() function-----------");
		
	String name="Syntax Technologies";
	int index=name.indexOf("y");// gonna return int.
	System.out.println(index);//------>1
		
	index=name.indexOf(" ");
	System.out.println(index);//---->6
	
	index=name.indexOf("Syntax");// hangi satirdan basliyor onun indexsini veriyor
	System.out.println(index);//---->0
	
	index=name.indexOf("!");
	System.out.println("index of not existing character"+index);//---->-1
	
	index=name.indexOf("Technologies");
	System.out.println("index of not existing character"+index);//---->7

	
	
	
	System.out.println();
	System.out.println("-----indexOf() function-----------");
	
	
	//String name="Syntax Technologies";--->12 ve 14 de o var
	index=name.indexOf("o");
	System.out.println("index of first o="+index);//-->12
	
	index=name.indexOf("o",13);
	System.out.println("index of second o="+index);//-->14

	
	}

}
