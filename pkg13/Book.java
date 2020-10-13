package pkg13;

public class Book extends RefCasting { // 서브
	private String name; // 책 이름
	private int price; // 가격
	
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
}
