package syntaxclass10;

public class Task3 {

	public static void main(String[] args) {
		/*Create an array of countries. 
		 * While retrieving all values from an array print capital 
		 * for each country. 
		 * (use 2 different loops).
		 * 
		 */
	
	String [] countries= {"USA","Denmark","Turkey","UK"};
//1 way
	
	for(String x:countries) {
		if(x.equals("USA")) {
			System.out.println("The capital of "+x+"is DC");
		}else if(x.equals("Denmark")) {
			System.out.println("The capital of "+x+"is Copenhagen");
		}else if(x.equals("Turkey")) {
			System.out.println("The capital of "+x+"is Ankara");
		}else if(x.equals("UK")) {
			System.out.println("The capital of "+x+"is London");
		}
	}
	System.out.println("--------------");
// 2 way
	
	
	
	for(int i=0; i<countries.length;i++) {
		if (countries.equals("USA")) {
		System.out.println("The capital of "+countries+" DC");
	}else if(countries.equals("Denmark")) {
		System.out.println("The capital of "+countries+" Copenhagen");
	}else if(countries.equals("Turkey")) {
		System.out.println("The capital of "+countries+" Ankara");
	}else if(countries.equals("UK")) {
		System.out.println("The capital of "+countries+" Londan");
	}
	
	}
	
//3 way
	System.out.println("--------------");
	for(int y=0; y<countries.length;y++) {
		
		switch (countries[y]) {
		case "USA":
			System.out.println("The capital of "+countries+" is DC");
			break;
		case "Denmark":
			System.out.println("The capital of "+countries+" is");
			break;
		case "Turkey": 
			System.out.println("The capital of "+countries+" is Ankara");
			break;
		case "UK":
			System.out.println("The capital of "+countries+" is London");
			break;
		
		}	
	}
	
//---------------------------------
	String[] countriess = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
	for (int y = 0; y < countriess.length; y++) {
        switch(countriess[y]) {
        
        case "USA":
            System.out.println("The capital is Washington DC");
            break;
        case "Poland":
            System.out.println("The capital is Warsaw");
            break;
        case "Ukraine":
            System.out.println("The capital is Kiev");
            break;
        case "Turkey":
            System.out.println("The capital is Ankara");
            break;
        case "Spain":
            System.out.println("The capital is Madrid");
            break;
        }
        
    }

	
	
	
	
	
	}

}
