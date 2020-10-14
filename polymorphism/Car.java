package polymorphism;

public class Car {
	private String name; // 차주
	private int price; // 가격
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
