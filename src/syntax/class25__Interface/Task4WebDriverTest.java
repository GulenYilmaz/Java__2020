package syntax.class25__Interface;
public class Task4WebDriverTest {
	public static void main(String[] args) {
		
		RemoteWebDriver ch=new ChromeDriverr();

		RemoteWebDriver ff=new FireFoxDriverr();
		
		RemoteWebDriver sf=new SafariDriverr();
		
		System.out.println("-----Interface RemoteWebDriver  ChromeDriverr------");
		ch.open();
		ch.close();
		ch.getTitle();
		ch.navigate();
	//	ch.getScreenshot(); this method can not have RemoteWebDriver
		
		System.out.println("-----Interface RemoteWebDriver  FireFoxDriverr------");
		ff.open();
		ff.close();
		ff.getTitle();
		ff.navigate();
	//	ff.getScreenshot(); this method can not have RemoteWebDriver
		
		System.out.println("-----Interface RemoteWebDriver  SafariDriverr------");
		sf.open();
		sf.close();
		sf.getTitle();
		sf.navigate();
	//	sf.getScreenshot(); this method can not have RemoteWebDriver
	
		TakeScreenshot ch1=new ChromeDriverr();
		
		TakeScreenshot ff1=new FireFoxDriverr();
		
		TakeScreenshot sf1=new SafariDriverr();
	
		System.out.println("-----Interface TakeScreenshot ------");
	    ch1.getScreenshot();
	    //ch1.open();--->this method does not include inside the TakeScreenshot
	    
	    ff1.getScreenshot();
	    sf1.getScreenshot();
	  
	}

}
