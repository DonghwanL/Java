package pkg15;

public class Baseball extends Sport {
	private double hitrate; // Ÿ��
	
	public Baseball(String name, int entry, double hitrate) {
		super(name, entry);
		this.hitrate = hitrate;
	}

	public void display() {
		String imsi = "";
		imsi += "\n���� �̸� : " + super.getName();
		imsi += "\n��Ʈ�� : " + super.getEntry();
		imsi += "\nŸ�� : " + this.hitrate;
		System.out.println(imsi);
	}

}
