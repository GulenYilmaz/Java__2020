package syntax.class26__Encapsulation_Collection;

public class DoctorTest {

	public static void main(String[] args) {
		
		Doctor doc=new Doctor();
		doc.setEmail("doctor@gmail.com");
		System.out.println(doc.getEmail());
		
		doc.setEmail("doctor@yahoo.com");//-->email must be of gmail type
		//setter icinde sopln oldugu icin print yapti
        //System.out.println(doc.getEmail());
		
	    doc.setEmail("");//--->email can not be empty
        //System.out.println(doc.getEmail());

	}
}