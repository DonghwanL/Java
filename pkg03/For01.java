package pkg03;

public class For01 {

	public static void main(String[] args) {
		// 1���� 10������ ����

		int total = 0;

		for (int i = 1; i < 11; i++) {
			// System.out.println(i);
			total += i;
		}
		System.out.println("���� 01 : " + total);

		// 1+3+5+7+9 = 25

		total = 0;

		for (int i = 1; i < 10; i+=2) {
			// System.out.println(i);
			total += i;
		}
		System.out.println("���� 02 : " + total);
		
		
		
		
		// ���� ������ ���Ͽ� �ʱ��, ���ǽ�, �������� ����� Ǯ�����.
		total = 0;
		for (int i = 1; i < 101; i+=3) {
			total += i;
		}
		System.out.println("���� 03 : " + total);
		
		total = 0;
		for (int i = 97; i > 1; i-=5) {
			total += i;
		}
		System.out.println("���� 04 : " + total);
		
		
		total = 0;
		for (int i = 1; i < 97; i+=5) {
			total += i*i;
		}
		System.out.println("���� 05 : " + total);

			

	

	}

}
