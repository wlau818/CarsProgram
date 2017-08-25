
public class NewCar extends Car {
	
	private String color;
	private double price;
	
	public NewCar(double price, String color) {
		super(price);
		this.price = price * 2;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean equals(NewCar car2) {
		boolean objectsEqual;
		boolean condition1 = this.getPrice() == (car2.getPrice());
		boolean condition2 = this.getColor().equals(car2.getColor());
		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}		
		return objectsEqual;
	}
	
	public void display() {
		System.out.println("price = $" + this.getPrice() + ", color = " + color);
	}

}
