package pkg13;

public class Book extends RefCasting { // ����
	private String name; // å �̸�
	private int price; // ����
	
	
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
