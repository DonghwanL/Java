package nopolymorphism;

public class Spark {
	private String name; // 차의 이름
	private int price; // 단가
	private String maker; // 제조사
	
	public Spark(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getMaker() {
		return maker;
	}

}
