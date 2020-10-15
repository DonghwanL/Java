package cartest;

public abstract class Car implements Speed, Display {
	private String name; // 차주
	private int price; // 가격
	private int speed; // 현재 속도
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
		String imsi = "차 이름 : " + this.name + "\n";
		imsi += "가격 : " + this.price;
		return imsi;
	}
	
}
