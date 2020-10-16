package pkgplayer;

public class VideoPlayer extends PlayerAdapter implements Skinnable {
	private String title; // ����
	private String grade; // ���

	public VideoPlayer() {}
	public VideoPlayer(String title, int showtime, String grade) {
		super(showtime);
		this.title = title;
		this.grade = grade;
		
		String imsi = "���� \'" + this.title + "\' �Դϴ�.\n";
		imsi += "��� �ð� : " + super.makeTime();
		System.out.println(imsi);
	}
	
	@Override
	public void play() {
		String imsi = "���� \'" + this.title + "\'��(��) ����մϴ�."; 
		System.out.println(imsi);
	}
	
	 @Override
	public void fast() {
		String imsi = "���� \'" + this.title + "\'��(��) ������ ����մϴ�."; 
		System.out.println(imsi);
	}
	 
	 @Override
	public void stop() {
		String imsi = "���� \'" + this.title + "\'��(��) ��� �����մϴ�."; 
		System.out.println(imsi);
	}

	@Override
	public void changeskin(EnumSkin color) {
		String imsi = "���� \'" + this.title + "\'�� ��Ų�� \'" + color.getColor() + "\'���� �����մϴ�."; 
		System.out.println(imsi);
	}
	
}
