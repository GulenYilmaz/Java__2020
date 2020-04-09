package syntax.class24__Abstract;

public class PhoneTest {

	public static void main(String[] args) {
		
		//new Phone();CE: cannot instantiate/create an object of Phone class because it is ABSTRACT
		
		Phone iphone=new iPhone();
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
System.out.println("------------");	
		Phone samsung=new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
System.out.println("------------");
		
//         iPhone iphone1=new iPhone();
//         iphone.call();
//         iphone.text();
//         iphone.takePicture();
//         iphone.playMusic();
//System.out.println("------------");	
//         Samsung samsung1=new Samsung();
//         samsung.call();
//         samsung.text();
//         samsung.takePicture();
//         samsung.playMusic();
//System.out.println("------------");

	}
}
