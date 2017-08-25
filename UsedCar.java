
public class UsedCar extends Car {
	
	private int mileage;
	private double price;
	
	public UsedCar (double price, int mileage) {
		super(price);
		this.price = price * 2;
		this.mileage = mileage;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public boolean equals(UsedCar car2) {
		boolean objectsEqual;
		
		boolean condition1 = this.getPrice() == (car2.getPrice());
		boolean condition2 = this.getMileage() == (car2.getMileage());
		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}		
		return objectsEqual;
	}
	
	public void display() {
		System.out.println("price = $" + this.getPrice() + "0, mileage = " + mileage);
	}

}
