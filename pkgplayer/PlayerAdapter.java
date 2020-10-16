package pkgplayer;

import java.text.DecimalFormat;

public class PlayerAdapter implements Player{
	// Player 인터페이스에 대한 추상 메소드를 모두 오버라이딩 했습니다.
	// Mp3Player 클래스는 fast()와 reverse() 메소드만 구현하려고 했으므로,
	// 이 메소드들만 다시 오버라이딩 하면 됩니다.
	
	private int showtime; // 재생시간 (단위 초)
	
	public PlayerAdapter() {}
	public PlayerAdapter(int showtime) {
		this.showtime = showtime;
	}

	@Override
	public void play() {
		System.out.println("PlayerAdapter play() 호출됨");
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void fast() {
		
	}

	@Override
	public void reverse() {
		
	}
	
	public String makeTime() {
		String pattern = "00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		String result = "";
		int hour = this.showtime / 3600;
		int minute = (this.showtime - hour * 3600) / 60;
		int second = this.showtime % 60;
		
		result = df.format(hour) + "시간 " + df.format(minute) + "분 " + df.format(second) + "초";

		return result;
	}

}
