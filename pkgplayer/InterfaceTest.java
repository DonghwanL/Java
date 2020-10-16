package pkgplayer;

public class InterfaceTest {

	public static void main(String[] args) {
		DvdPlayer dvd01 = new DvdPlayer("영웅본색", 7200); // 제목, 상영시간
		dvd01.fast();
		dvd01.slow();
		dvd01.reverse();
		
		Mp3Player mp3 = new Mp3Player("이선희", "J에게", 210); // 가수, 노래, 재생 시간
		mp3.fast();
		mp3.reverse();
		
		Player[] myplayer = new Player[3];
		myplayer[0] = new DvdPlayer("기생충", 7400);
		myplayer[1] = new Mp3Player("나훈아", "고향역", 240);
		myplayer[2] = new VideoPlayer("담보", 300, "15세 이상 관람가");
		
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
