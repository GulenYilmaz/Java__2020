package syntax.class25__Interface;

public interface Task1Shape {
	/*
	 * Create an Interface ‘Shape’ with undefined methods as calculateArea and
	 * calculatePerimiter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 */
	void calculateArea(double r);

	void calculatePerimiter(double r);
}

class Circle implements Task1Shape {
	@Override
	public void calculateArea(double r) {
		System.out.println("Shape of circle is "+(r*r*3.14));
	}

	@Override
	public void calculatePerimiter(double r) {
		System.out.println("Perimiter of circle is "+(3.14*r*r));
	}
}

class Square implements Task1Shape {
	@Override
	public void calculateArea(double r) {
		System.out.println("Shape of Square is "+(r*r));
	}

	@Override
	public void calculatePerimiter(double r) {
		System.out.println("Shape of Square is "+(4*r));
	}
}