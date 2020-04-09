package syntax.class03__Casting_and_If_Condition;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// widening happens implicitly

		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99;-->compile time error saying:
		//type mismatch, cannot convert double to int
		//norrowing explicitly implementing
		
		int i=(int)10.99;
		System.out.println(i);
		
		//byte -128 to 127
		byte b=(byte)1284;
		System.out.println(b);
	}

}
