package polymorphism;

public class Spark extends Car {
	private String maker; // Á¦Á¶»ç
	
	public String getMaker() {
		return maker;
	}

	public Spark(String name, int price, String maker) {
		super(name, price);
		this.maker = maker;
	}
	
}
