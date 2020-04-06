package syntax.class06;

public class SwichIntro {

	public static void main(String[] args) {
	
		int day=5;
		String dayName;
	if(day==1) {
		dayName="Monday";
	}else if(day==2) {
		dayName="Tuesday";
	}else if(day==3) {
		dayName="wednesday";
	}else if(day==4) {
		dayName="Thursday";
	}else if(day==5) {
		dayName="friday";
	}else if(day==6) {
		dayName="saturday";
	}else if(day==7) {
		dayName="sunday";
	}else {
		dayName="Invalid";
	}
	System.out.println("Today is "+dayName);
	System.out.println("-----Using Switch---------");
	
	String today;
    switch(day) {   
	
	    case 1:
		     today="Monday";
		     break;
	    case 2:
			today="Tuesday";
			break;
	    case 3:
			today="Wednesday";
			break;
	    case 4:
			today="Thursday";
			break;
	    case 5:
			today="friday";
			break;
	    case 6:
			today="saturday";
			break;
	    case 7:
			today="sunday";
			break;
	    default:
			today="Invalied";
			
	}
        System.out.println("Today is "+today);
	}
		
	}
