package pkg10;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 주사위 5번 던지기, Random 클래스
		// rand 객체 : 랜덤한 수를 호출할 수 있습니다.
		
		Random rand = new Random();
		
		int total = 0;
		
		for (int i = 1; i <= 5; i++) {
			int su = rand.nextInt(6) + 1;
			System.out.println(su);
			total += su;
		}
		
		System.out.println("총합 : " + total);
		

	}

}
