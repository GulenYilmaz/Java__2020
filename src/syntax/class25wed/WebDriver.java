package syntax.class25wed;
/*
 * Create a WebDriver Interface that will have the following 
 * unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), 
 * findElement(). Create 2 classes that implements WebDriver interface: 
 * ChromeDriver and FirefoxDriver.
 */
interface TakesScreenshot{
	
	String fileExtension=".png";
	
	void takePicture();
	
	//features below were added from Java 1.8 version
	static void takeSelfie() {
		System.out.println("I can take a selfie");
	}
	
	default void takePanoramaPic() {
		System.out.println("I can take panoramic pistures");
	}
}

public interface WebDriver {
	
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

class ChromeDriver implements WebDriver, TakesScreenshot {
	@Override
	public void openBrowser() {
		System.out.println("We can open Chrome");
	}

	@Override
	public void closeBrowser() {
		System.out.println("we can close Chrome");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize Chrome window");

	}

	@Override
	public void findElement() {
		System.out.println("We can find element in Chrome");

	}

	@Override
	public void takePicture() {
		System.out.println("In crome we can take picture");
	}
}

class FireFoxDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("We can open FireFox");

	}

	@Override
	public void closeBrowser() {
		System.out.println("We can close FireFox");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize FireFox window");

	}

	@Override
	public void findElement() {
		System.out.println("We can find elements in FireFox");

	}

}