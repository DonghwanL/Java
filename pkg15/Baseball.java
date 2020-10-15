package pkg15;

public class Baseball extends Sport {
	private double hitrate; // 타율
	
	public Baseball(String name, int entry, double hitrate) {
		super(name, entry);
		this.hitrate = hitrate;
	}

	public void display() {
		String imsi = "";
		imsi += "\n게임 이름 : " + super.getName();
		imsi += "\n엔트리 : " + super.getEntry();
		imsi += "\n타율 : " + this.hitrate;
		System.out.println(imsi);
	}

}
