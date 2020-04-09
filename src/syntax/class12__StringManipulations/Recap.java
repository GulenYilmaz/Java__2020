package syntax.class12__StringManipulations;

public class Recap {

	public static void main(String[] args) {
	
		
		
		
		String str="";// empty value
		System.out.println(str.isEmpty());
		
		
		String str1=null;//----> we have to initilaze
		
		
	// no value at all-->null means	
	//	=; koyarsak bir sey yazmamizi isteyecek
	//	System.out.println(str1.isEmpty());  --->Run time  Nullpointer exception
		
		String str2=" Good morning";
		String str3="students";
		String str4="!";
		
		str2=str2.concat(str3).concat(str4);
		
		// " Good morning "-> "Good morning"-->"Good Morningstudents"--->"Good morningstudents!"
		
		str2=str2.              trim().        concat(str3).              concat(str4);
		System.out.println(str2);
		
		
		
		
		String str5="Day";
		int date=25;
		//str5.concat(date);CE:change type 
		
		
		
		
		String str6=" Hello ";
		String str7="Syntax";
		//          str6=str6.concat(str7).trim();
		//          System.out.println(str6);--> "Hello Syntax"
		str6=str6.trim().concat(str7);
		System.out.println(str6);            //"HelloSyntax"
	}

}
