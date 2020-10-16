package pkgplayer;

public class Mp3Player extends PlayerAdapter {
	private String singer; // 가수
	private String title; // 노래
	
	public Mp3Player() {}
	public Mp3Player(String singer, String title, int showtime) {
		super(showtime);
		this.singer = singer;
		this.title = title;
		
		String imsi = "노래 \'" + this.title + "\' 입니다.\n";
		imsi += "재생 시간 : " + super.makeTime();
		System.out.println(imsi);
	}
	
	@Override
	public void play() {
		String imsi = "노래 \'" + this.title + "\'을(를) 재생합니다."; 
		System.out.println(imsi);
	}

	@Override
	public void fast() {
		String imsi = "노래 \'" + this.title + "\'을(를) 빠르게 재생합니다."; 
		System.out.println(imsi);
	}
	
	@Override
	public void stop() {
		String imsi = "노래 \'" + this.title + "\'을(를) 재생 중지합니다."; 
		System.out.println(imsi);
	}
	
	@Override
	public void reverse() {
		String imsi = "노래 \'" + this.title + "\'을(를) 되감기 합니다."; 
		System.out.println(imsi);
	}
	
}
