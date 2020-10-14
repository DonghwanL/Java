package nopolymorphism;

public class Cube {
	private String name; // 차의 이름
	private int price; // 단가
	private double fuelEfficiency; // 연비
	
	public Cube(String name, int price, double fuelEfficiency) {
		this.name = name;
		this.price = price;
		this.fuelEfficiency = fuelEfficiency;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
	
}
