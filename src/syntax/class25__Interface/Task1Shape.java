package syntax.class25__Interface;

public interface Task1Shape {

	void calculateArea();
	void calculatePerimiter();
	
}
class Circle implements Task1Shape{

	@Override
	public void calculateArea() {
System.out.println("Shape of circle is (2*r*3.14)");		
	}

	@Override
	public void calculatePerimiter() {
System.out.println("Perimiter of circle is (3.14*r*r)");		
	}
	
}
class Square implements Task1Shape{

	@Override
	public void calculateArea() {
		System.out.println("Shape of Square is (a*a)");		
		
	}

	@Override
	public void calculatePerimiter() {
		System.out.println("Shape of Square is (4*a)");		
		
	}
	
}