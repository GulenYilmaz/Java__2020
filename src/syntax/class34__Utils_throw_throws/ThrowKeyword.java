package syntax.class34__Utils_throw_throws;



class BalanceException extends RuntimeException{
	
	public BalanceException(String message) {
		super(message);
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {
		
		NullPointerException npe=new NullPointerException();
		
		//throw npe;
		
		//throwException();
		
		withdraw(10000, 1000);
		
		browser("uhkughugukg");
	}
	
	//create a withdraw method for balance and amount 
	public static void withdraw(int balance, int amount) {
		
		if(amount>balance) {
			throw new BalanceException("You balance is too low");
		}
	}
	
	public static void throwException() {
		throw new ArithmeticException();
	}
	
	public static void browser(String browser) {
		
		switch(browser) {
		case "chrome":
			System.out.println("Using chrome browser");
			break;
		case "firefox":
			System.out.println("Using firefox browser");
			break;
		default:
			throw new RuntimeException("Invalid browser");
		}
	}
}
