package polymorphism;

public class Tico extends Car {
	private String comment; // �ڸ�Ʈ
	public Tico() {}
	
	public String getComment() {
		return comment;
	}

	public Tico(String name, int price, String comment) {
		super(name, price);
		this.comment = comment;
	}
}
