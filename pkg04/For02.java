package pkg04;
public class For02 {

	public static void main(String[] args) {
		// 1부터 10까지의 홀수와 짝수의 총합 각각 구하기
		int odd = 0, even = 0;
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}			
		}
		
		System.out.printf("짝수의 총합 : %d\n", even);
		System.out.printf("홀수의 총합 : %d\n", odd);
			
	}

}
