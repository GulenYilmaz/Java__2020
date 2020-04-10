package syntax.class25__Interface;

public class Task3CarTest {

	public static void main(String[] args) {

		Task3Car truck=new 	Truck(12000,"white",1255);
		double carPrice=truck.calculateSalePrice();
		System.out.println(carPrice);
		
	}

}
