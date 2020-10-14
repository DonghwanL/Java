package polymorphism;

public class Cube extends Car {
	private double fuelEfficiency;
	
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public Cube(String name, int price, double fuelEfficiency) {
		super(name, price);
		this.fuelEfficiency = fuelEfficiency;
	}

}
