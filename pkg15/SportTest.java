package pkg15;

public class SportTest {

	public static void main(String[] args) {
		// 이름, 엔트리, 타율
		Baseball baseball = new Baseball("야구", 9, 0.235);
		baseball.play();
		baseball.display();
		
		// 이름, 엔트리, 골 수
		Football soccer = new Football("축구", 11, 5);
		soccer.show();
		
		// 다음 문장을 실행하면 "축구는 재밌어"라는 문장이 출력 된다고 합니다.
		System.out.println(soccer);
	}

}
