package syntax.class26__Encapsulation_Collection;

public class WrapperClasses {

	public static void main(String[] args) {
		
		
		int i=10;//primitive value 
		
		//auto boxing
		Integer num=10;//-->I am gonna wrapped it ,store it inside the box and this box name is Integer type
		//-->now this value is not present  primitive type value , this value now is present a Integer Type value =Object
		
		String s=num.toString();
		System.out.println(num.MIN_VALUE);
		
		byte b1=90;//--->primitive type
		Byte b=90;//--->object type
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		
		String s1=b.toString();//s1 is String now
		System.out.println(s1);
		
		
		
		//auto unboxing
		Boolean bool=true;// if we want to takeout our abject we can auto unboxing 
		boolean b2=bool;// now it turns primitive type boolean
		

	}
}