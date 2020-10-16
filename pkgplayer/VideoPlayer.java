package pkgplayer;

public class VideoPlayer extends PlayerAdapter implements Skinnable {
	private String title; // 제목
	private String grade; // 등급

	public VideoPlayer() {}
	public VideoPlayer(String title, int showtime, String grade) {
		super(showtime);
		this.title = title;
		this.grade = grade;
		
		String imsi = "비디오 \'" + this.title + "\' 입니다.\n";
		imsi += "재생 시간 : " + super.makeTime();
		System.out.println(imsi);
	}
	
	@Override
	public void play() {
		String imsi = "비디오 \'" + this.title + "\'을(를) 재생합니다."; 
		System.out.println(imsi);
	}
	
	 @Override
	public void fast() {
		String imsi = "비디오 \'" + this.title + "\'을(를) 빠르게 재생합니다."; 
		System.out.println(imsi);
	}
	 
	 @Override
	public void stop() {
		String imsi = "비디오 \'" + this.title + "\'을(를) 재생 중지합니다."; 
		System.out.println(imsi);
	}

	@Override
	public void changeskin(EnumSkin color) {
		String imsi = "비디오 \'" + this.title + "\'의 스킨을 \'" + color.getColor() + "\'으로 변경합니다."; 
		System.out.println(imsi);
	}
	
}
