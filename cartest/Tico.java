package cartest;

public class Tico extends Car {
	private String comments; // �ڸ�Ʈ
	public Tico() {}
	
	public Tico(String name, int price, String comments) {
		super(name, price);
		this.comments = comments;
	}

	@Override
	public void display() {
		String imsi = super.getName() + "�� ���� �ӵ� : " + super.getSpeed();
		System.out.println(imsi);
	}
	
	@Override
	public void speedup(int su) {
		super.setSpeed(+su); // ����
	}
	
	@Override
	public void speeddown(int su) {
		super.setSpeed(-su); // ����
	}
	
	@Override
	public String toString() {
		String imsi = "�ڸ�Ʈ : " + this.comments;
		return super.toString() + "\n" + imsi;
	}
}
