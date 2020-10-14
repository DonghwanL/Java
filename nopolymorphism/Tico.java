package nopolymorphism;

public class Tico {
	private String name; // 차의 이름
	private int price; // 단가
	private String comment; // 부연 설명
	
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public String getComment() {
		return comment;
	}

	
	public Tico(String name, int price, String comment) {
		this.name = name;
		this.price = price;
		this.comment = comment;
	}
}
