package pkgplayer;

public class Mp3Player extends PlayerAdapter {
	private String singer; // ����
	private String title; // �뷡
	
	public Mp3Player() {}
	public Mp3Player(String singer, String title, int showtime) {
		super(showtime);
		this.singer = singer;
		this.title = title;
		
		String imsi = "�뷡 \'" + this.title + "\' �Դϴ�.\n";
		imsi += "��� �ð� : " + super.makeTime();
		System.out.println(imsi);
	}
	
	@Override
	public void play() {
		String imsi = "�뷡 \'" + this.title + "\'��(��) ����մϴ�."; 
		System.out.println(imsi);
	}

	@Override
	public void fast() {
		String imsi = "�뷡 \'" + this.title + "\'��(��) ������ ����մϴ�."; 
		System.out.println(imsi);
	}
	
	@Override
	public void stop() {
		String imsi = "�뷡 \'" + this.title + "\'��(��) ��� �����մϴ�."; 
		System.out.println(imsi);
	}
	
	@Override
	public void reverse() {
		String imsi = "�뷡 \'" + this.title + "\'��(��) �ǰ��� �մϴ�."; 
		System.out.println(imsi);
	}
	
}
