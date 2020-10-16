package pkgplayer;

import java.text.DecimalFormat;

public class PlayerAdapter implements Player{
	// Player �������̽��� ���� �߻� �޼ҵ带 ��� �������̵� �߽��ϴ�.
	// Mp3Player Ŭ������ fast()�� reverse() �޼ҵ常 �����Ϸ��� �����Ƿ�,
	// �� �޼ҵ�鸸 �ٽ� �������̵� �ϸ� �˴ϴ�.
	
	private int showtime; // ����ð� (���� ��)
	
	public PlayerAdapter() {}
	public PlayerAdapter(int showtime) {
		this.showtime = showtime;
	}

	@Override
	public void play() {
		System.out.println("PlayerAdapter play() ȣ���");
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
		
		result = df.format(hour) + "�ð� " + df.format(minute) + "�� " + df.format(second) + "��";

		return result;
	}

}
