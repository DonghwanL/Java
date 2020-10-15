package cartest;

public abstract class Car implements Speed, Display {
	private String name; // ����
	private int price; // ����
	private int speed; // ���� �ӵ�
	public Car() {}
	
	
	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed += speed;
	}

	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		String imsi = "�� �̸� : " + this.name + "\n";
		imsi += "���� : " + this.price;
		return imsi;
	}
	
}
