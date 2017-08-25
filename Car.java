
public abstract class Car {
	
	private double price;
	
	public Car(double price) {
		this.price = price * 2;
	}

	public double getPrice() {
		return price;
	}

}
