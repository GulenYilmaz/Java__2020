package syntax.class24;
public abstract class Phone {

	//implemented methods
	public void call() {
		System.out.println("Phone can make a call");
	}
	
	public void text() {
		System.out.println("Phone can send text");
	}
	
	
	//unimplemented methods=undefined methods=abstract methods
	public abstract void takePicture(); //with abstract keyword
	
	public abstract void playMusic();   //with abstract keyword
	
	// all abstract method details comes from child class 
}



class iPhone extends Phone{// if we extends abstract class compiler give a error that we have to 
	//implement from parent class unimplement methods 

	@Override
	public void takePicture() {
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("iPhones play music using apple store");
	}

}

class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("Sansung plays music using google store");
	}
		
	   
	  
	}