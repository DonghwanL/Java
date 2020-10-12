package pkg05;

public class SumTest {

	public static void main(String[] args) {
		// 1���� 10������ ���� �߿���
		// 3�� ����� �� : 3 + 6 + 9 = 18�̴�. (������ sumA)
		// 3�� ����� �ƴ� ���� �� 5�̻��� �� �߿��� 8�� ������ ���� ������ (5 + 7 + 10) = 22�̴�. (������ sumB)
		// 3�� ����� �ƴ� ���� �� 5�̸��� ���� ������ (1 + 2 + 4) = 7�̴�. (������ sumC)

		int sumA = 0, sumB = 0, sumC = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				sumA += i;
			} else { // 3�� ����� �ƴϸ�
				if (i >= 5) { // 5�̻�
					if (i != 8) {
						sumB += i; // 8�� �ƴ� ��쿡 ���Ͽ�
					}
				} else { // 5�̸�
					sumC += i;
				}
			}
		}

		System.out.println("sumA : " + sumA);
		System.out.println("sumB : " + sumB);
		System.out.println("sumC : " + sumC);

	}

}
