package polymorphism;

public class Car {
	private String name; // ����
	private int price; // ����
	public Car() {}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
