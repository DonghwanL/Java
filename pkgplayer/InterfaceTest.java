package pkgplayer;

public class InterfaceTest {

	public static void main(String[] args) {
		DvdPlayer dvd01 = new DvdPlayer("��������", 7200); // ����, �󿵽ð�
		dvd01.fast();
		dvd01.slow();
		dvd01.reverse();
		
		Mp3Player mp3 = new Mp3Player("�̼���", "J����", 210); // ����, �뷡, ��� �ð�
		mp3.fast();
		mp3.reverse();
		
		Player[] myplayer = new Player[3];
		myplayer[0] = new DvdPlayer("�����", 7400);
		myplayer[1] = new Mp3Player("���ƾ�", "���⿪", 240);
		myplayer[2] = new VideoPlayer("�㺸", 300, "15�� �̻� ������");
		
		showInfo(myplayer);
	}

	private static void showInfo(Player[] player) {
		for (int i = 0; i < player.length; i++) {
			player[i].play();
			player[i].fast();
			player[i].stop();
			
			if (player[i] instanceof DvdPlayer) {
				DvdPlayer dvd = (DvdPlayer)player[i];
				dvd.slow();
				dvd.autoreverse();
			} else if (player[i] instanceof VideoPlayer) {
				VideoPlayer video = (VideoPlayer)player[i];
				video.changeskin(EnumSkin.BLUE);
			}

			System.out.println();
		}
		
	}

}
