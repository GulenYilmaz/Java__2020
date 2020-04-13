package syntax.class12__String_Manipulations;

public class StringEquals {

	public static void main(String[] args) {
String s1= new String ("gulen");
String s2= new String ("gulen");



if (s1==s2) {
// class in referanslarini kiyaslamak istiyorsak == ifadesini kullanmamiz gerekir
	
	System.out.println("egual");
}else {
	System.out.println("not equal");
}

if (s1.contentEquals(s2)) {
// class in icindeki degerleri kiyaslamak istiyorsak equals methodunu kullanmamiz gerekir
	System.out.println("egual");
}else {
	System.out.println("not equal");
}

	
	
	}

}
