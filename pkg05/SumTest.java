package pkg05;

public class SumTest {

	public static void main(String[] args) {
		// 1부터 10까지의 정수 중에서
		// 3의 배수의 합 : 3 + 6 + 9 = 18이다. (변수명 sumA)
		// 3의 배수가 아닌 숫자 중 5이상인 수 중에서 8을 제외한 수의 총합은 (5 + 7 + 10) = 22이다. (변수명 sumB)
		// 3의 배수가 아닌 숫자 중 5미만의 수의 총합은 (1 + 2 + 4) = 7이다. (변수명 sumC)

		int sumA = 0, sumB = 0, sumC = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				sumA += i;
			} else { // 3의 배수가 아니면
				if (i >= 5) { // 5이상
					if (i != 8) {
						sumB += i; // 8이 아닌 경우에 한하여
					}
				} else { // 5미만
					sumC += i;
				}
			}
		}

		System.out.println("sumA : " + sumA);
		System.out.println("sumB : " + sumB);
		System.out.println("sumC : " + sumC);

	}

}
