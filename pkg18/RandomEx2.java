package pkg18;
import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// 진위형 배열 5개를 선언하고, 참 또는 거짓을 세팅합니다.
		boolean[] bool = new boolean[5];
		for (int i = 0; i < bool.length; i++) {
			bool[i] = rand.nextBoolean();
			System.out.println(bool[i] + "\t");
		}
		System.out.println();
		
		boolean res = rand.nextBoolean();
		System.out.println(res);
		
		// 0.0이상 1.0미만의 실수 값을 반환합니다.
		double dbl = rand.nextDouble();
		System.out.println(dbl);
		
		// nextInt(n) : 0부터 (n-1)까지의 임의의 정수 1개를 추출합니다.
		int jungsu = rand.nextInt(6) + 1;
		System.out.println(jungsu);
		
		// 주사위 3번 던지기
		int total = 0;
		int[] jusawee = new int[3];
		
		System.out.println("주사위 " + jusawee.length + "번 던지기");
		
		for (int i = 0; i < jusawee.length; i++) {
			jusawee[i] = rand.nextInt(6) + 1;
			total += jusawee[i];
			
			if (i == (jusawee.length - 1)) {
				System.out.print(jusawee[i] + " = ");
			} else {
				System.out.print(jusawee[i] + " + ");
			}
		}
		System.out.println(total);

		
		// 랜덤 값 시드 배정하기
		// 시드 값 : 랜덤 메소드에 넣어 주는 임의 정수를 의미합니다.
		// 시드 값을 넣어 주는 행위를 시드 배정이라고 합니다.
		// 일반적으로 시드 배정을 하지 않지만, 항상 동일한 패턴으로 랜덤 값을 처리하려면 시드 배정을 해줘야 합니다.
		// 다음은 1234에 대한 시드 배정 랜덤 값을 보여 줍니다.
		System.out.println("시드 배정 예시");
		
		long seed = 1234;
		Random rand2 = new Random(seed);
		for (int i = 0; i < 10; i++) {
			int rnd = rand2.nextInt(6) + 1;
			System.out.println(rnd);
		}
		

	}

}
