package pkg15;

public class Sport {
	private String name; // 종목
	private int entry; // 엔트리
	public Sport() {};
	
	public Sport(String name, int entry) {
		this.name = name;
		this.entry = entry;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEntry() {
		return entry;
	}
	
	public final void play() {
		String imsi = this.name + " 게임을 합니다.";
		System.out.println(imsi);
	}
}
