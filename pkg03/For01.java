package pkg03;

public class For01 {

	public static void main(String[] args) {
		// 1부터 10까지의 총합

		int total = 0;

		for (int i = 1; i < 11; i++) {
			// System.out.println(i);
			total += i;
		}
		System.out.println("총합 01 : " + total);

		// 1+3+5+7+9 = 25

		total = 0;

		for (int i = 1; i < 10; i+=2) {
			// System.out.println(i);
			total += i;
		}
		System.out.println("총합 02 : " + total);
		
		
		
		
		// 다음 문제에 대하여 초기식, 조건식, 증감식을 만들고 풀어보세요.
		total = 0;
		for (int i = 1; i < 101; i+=3) {
			total += i;
		}
		System.out.println("총합 03 : " + total);
		
		total = 0;
		for (int i = 97; i > 1; i-=5) {
			total += i;
		}
		System.out.println("총합 04 : " + total);
		
		
		total = 0;
		for (int i = 1; i < 97; i+=5) {
			total += i*i;
		}
		System.out.println("총합 05 : " + total);

			

	

	}

}
