package syntax.class23__RunTime_Polymorphism;

public class WebDriver {

	public void open() {
		System.out.println("Opening browser");
	}
}

class FirefoxDriver extends WebDriver {
	public void open() {
		System.out.println("Opening firefox browser");
	}
}

class ChromeDriver extends WebDriver {

	public void open() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorerDriver extends WebDriver {
	public void open() {
		System.out.println("Opening ie browser");
	}
	public void close() {
		System.out.println("Opening ie close");
	}
}
