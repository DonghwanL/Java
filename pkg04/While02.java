package pkg04;

public class While02 {

	public static void main(String[] args) {
		// 1���� 10������ Ȧ���� ¦���� ���� ���� ���ϱ�
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

		System.out.printf("¦���� ���� : %d\n", even);
		System.out.printf("Ȧ���� ���� : %d\n", odd);

	}

}
