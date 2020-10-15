package pkg15;

public class Football extends Sport {
	private int goals;

	public Football(String name, int entry, int goals) {
		super(name, entry);
		this.goals = goals;
	}

	public void show() {
		String imsi = "";
		imsi += "\n게임 이름 : " + super.getName();
		imsi += "\n엔트리 : " + super.getEntry();
		imsi += "\n골 수 : " + this.goals;
		System.out.println(imsi);
	}
	
	@Override
	public String toString() {
		String imsi = "";
		imsi = "축구는 재밌어";
		return imsi;
	}
	

}
