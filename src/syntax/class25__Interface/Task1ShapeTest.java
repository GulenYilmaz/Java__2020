package syntax.class25__Interface;

public class Task1ShapeTest {

	public static void main(String[] args) {
		
		Task1Shape circle = new Circle();
		circle.calculateArea(5);
		circle.calculatePerimiter(4);

		Task1Shape square = new Square();
		square.calculateArea(7);
		square.calculatePerimiter(6);

	}

}
