package pkg04;
public class For02 {

	public static void main(String[] args) {
		// 1���� 10������ Ȧ���� ¦���� ���� ���� ���ϱ�
		int odd = 0, even = 0;
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}			
		}
		
		System.out.printf("¦���� ���� : %d\n", even);
		System.out.printf("Ȧ���� ���� : %d\n", odd);
			
	}

}
