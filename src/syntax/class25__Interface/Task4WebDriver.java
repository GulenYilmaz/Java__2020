package syntax.class25__Interface;

public interface Task4WebDriver {
	void open();

	void close();

	String getTitle();
}

interface TakeScreenshot {
	void getScreenshot();
}

interface RemoteWebDriver extends Task4WebDriver, TakeScreenshot {
	void navigate();
}

class ChromeDriverr implements RemoteWebDriver {
	public void open() {
		System.out.println("ChromeDriver can open ");
	}

	public void close() {
		System.out.println("ChromeDriver can close ");
	}

	public String getTitle() {
		System.out.println("ChromeDriver can  get title ");
		return null;
	}

	public void navigate() {
		System.out.println("ChromeDriver can have navigate ");
	}

	public void getScreenshot() {
		System.out.println("ChromeDriver can  get screenshot");
	}
}

class FireFoxDriverr implements RemoteWebDriver {
	public void open() {
		System.out.println("FireFoxDriver can  open ");
	}

	public void close() {
		System.out.println("FireFoxDriver can  close ");
	}

	public String getTitle() {
		System.out.println("FireFoxDriver can  get title ");
		return null;
	}

	public void navigate() {
		System.out.println("FireFoxDriver can  have navigate ");
	}

	public void getScreenshot() {
		System.out.println("FireFoxDriver can  get screenshot ");
	}
}

class SafariDriverr implements RemoteWebDriver {
	public void open() {
		System.out.println("SafariDriver can  open ");
	}

	public void close() {
		System.out.println("SafariDriver can  close ");
	}

	public String getTitle() {
		System.out.println("SafariDriver can get title ");
		return null;
	}

	public void navigate() {
		System.out.println("SafariDriver can  have navigate ");
	}

	public void getScreenshot() {
		System.out.println("SafariDriver can  get screenshot ");
	}
}