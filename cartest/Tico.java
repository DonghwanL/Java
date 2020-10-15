package cartest;

public class Tico extends Car {
	private String comments; // 코멘트
	public Tico() {}
	
	public Tico(String name, int price, String comments) {
		super(name, price);
		this.comments = comments;
	}

	@Override
	public void display() {
		String imsi = super.getName() + "의 현재 속도 : " + super.getSpeed();
		System.out.println(imsi);
	}
	
	@Override
	public void speedup(int su) {
		super.setSpeed(+su); // 쓰기
	}
	
	@Override
	public void speeddown(int su) {
		super.setSpeed(-su); // 쓰기
	}
	
	@Override
	public String toString() {
		String imsi = "코멘트 : " + this.comments;
		return super.toString() + "\n" + imsi;
	}
}
