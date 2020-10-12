package pkg04;

public class While02 {

	public static void main(String[] args) {
		// 1부터 10까지의 홀수와 짝수의 총합 각각 구하기
		int odd = 0, even = 0;
		int i = 1;

		while (i < 11) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			i++;
		}

		System.out.printf("짝수의 총합 : %d\n", even);
		System.out.printf("홀수의 총합 : %d\n", odd);

	}

}
