package pkg15;

public class Sport {
	private String name; // ����
	private int entry; // ��Ʈ��
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
		String imsi = this.name + " ������ �մϴ�.";
		System.out.println(imsi);
	}
}
