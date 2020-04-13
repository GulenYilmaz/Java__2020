package syntax.class26__Encapsulation_Collection;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		//emp.name="";---> is not visible because it is private
		// thats why how we can achieve to variables for getter and setter methods
		emp.setName("asdfgrt");
		emp.setName("gulen");
		emp.setName("gul");
		emp.setName("jihy");
		emp.setName("jihyy");// ---> en son verdigiiz degeri print yapiyor
		
		// ayni isimden kelime yazarsak onceki ismi yazdiriyor
		System.out.println(emp.getName());
		//getter kullanarak verdigimiz degeri return edip yazdiriyoruz
		
		
		//System.out.println(emp.setName("you"));
		//---> give error we can not print setter because of no return type for void
		
		
		
		
		System.out.println(emp.getName());
	
		// setter metodunda print yapmak isin sopln kullanmamiz gerekiyor  cunku void kullaniyoruz
		// getter da return type oldugu icin bizim degerimize esitliyor , initialize etmemize gerek kalmiyor 
		// getter metodunda sadece class daki degeri okutuyoruz
		// setter metodunda deger atayabiliyoruz
	    
		emp.getAge();// we can achieve class variable
	    System.out.println(emp.getAge());
	}
}
