package syntax.class21wed;

public class MathTeacher extends Teacher{

	public MathTeacher(String name, String lastName) {
		//super();compiler will make call implicitly if you not
		super(name, lastName);
	}
}