package pkg04;

public class For05 {

	public static void main(String[] args) {
		// 1���� 10������ ���� �߿��� 
		// 3�� ����̰ų� 5�� ����� �׸���� ���� ���ϱ�
		// 3+5+6+9+10=33
		
		int total = 0;
		
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				total += i;
			}
		}	
		
		System.out.println("���01 : " + total);

		
		// 1���� 50������ ���� �߿���
		// sumB 3�� ����� ���� = 3+6+9+...+48
		// sumA 3�� ����� �ƴ� ���� ���� = 1+2+4+5+...+50
		// ��� sumA - sumB = 459
		
		int sumA = 0, sumB = 0;
		
		for (int i = 1; i < 51; i++) {	
			if (i % 3 == 0) {
				sumB += i;
			} else {
				sumA += i;
			}
		}
		
		System.out.println("���02 : " + (sumA - sumB));
		
		
	

	}

}
