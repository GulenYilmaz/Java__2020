package syntax.class23;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver driver=new InternetExplorerDriver();
		driver.open();

//driver.close();----> parent class da olmadigi icin print yapmadi
//upcasting yaptigimizda Parent class da olmayan metodlara ulasamayiz
//parent class metodlari print yapilir ama overriding yaparken 
//child classs da ayni method varsa child class daki method print yapilir
		
		InternetExplorerDriver obj=new InternetExplorerDriver();
		obj.open();
		obj.close();
	}
}