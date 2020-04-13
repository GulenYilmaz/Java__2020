package syntax.class25__Interface;
/*
 * Create a Class Car that would have the following fields: 
 * carPrice and color and method calculateSalePrice() 
 * which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. 
The Truck class has field as weight and has its own implementation 
of  calculateSalePrice() method in 
which returned price calculated as following: 
if weight>2000 then returned price 
car should include 10% discount, otherwise 20% discount.
 */
public abstract class Task3Car {

	double carPrice;
	String color;
	
	Task3Car(double carPrice,String color){
		this.carPrice=carPrice;
		this.color=color;
	}
	
	public abstract double calculateSalePrice(); 
	
		
		
}
class sedan extends Task3Car{

	sedan(double carPrice, String color) {
		super(carPrice, color);
	}

	@Override
	public double calculateSalePrice() {
		return 0;
	}
	
}
class Truck extends Task3Car{
	int weight;
	
	Truck(double carPrice, String color,int weight) {
		super(carPrice, color);
        this.weight=weight;
     }
	public double calculateSalePrice() {
		
		if (weight>2000) {
			carPrice= (carPrice-(carPrice*(0.1)));
		}else {
			carPrice= (carPrice-(carPrice*(0.2)));
		}
		
		return carPrice;
	}	
	
}