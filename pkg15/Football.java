package pkg15;

public class Football extends Sport {
	private int goals;

	public Football(String name, int entry, int goals) {
		super(name, entry);
		this.goals = goals;
	}

	public void show() {
		String imsi = "";
		imsi += "\n���� �̸� : " + super.getName();
		imsi += "\n��Ʈ�� : " + super.getEntry();
		imsi += "\n�� �� : " + this.goals;
		System.out.println(imsi);
	}
	
	@Override
	public String toString() {
		String imsi = "";
		imsi = "�౸�� ��վ�";
		return imsi;
	}
	

}
