package pkg04;
public class SunToOne {

	public static void main(String[] args) {
		// 1���� n������ �� ���ϱ�
		int su = 9;
		int total = 0;
		
		for (int i = 1; i <= su; i++) {
			total += i;
		}
		
		System.out.println("���� 01 : " + total);
		
		
		// su1���� su2������ ���� ���ϱ�
		int su1 = 2;
		int su2 = 5;
		total = 0;
		
		for (int i = su1; i <= su2; i++) {
			total += i;
		}
		
		System.out.println("���� 02 : " + total);
		
		// su1���� su2������ ���� ���ϱ�
		
		su1 = 6;
		su2 = 3;
		total = 0;
		
		for (int i = su2; i <= su1; i++) {
			total += i;
		}
		
		System.out.println("���� 03 : " + total);
		
		// swap
		
		int temp;
		temp = su2;
		su2 = su1;
		su1 = temp;
		total = 0;
		
		for (int i = su1; i <= su2; i++) {
			total += i;
		}
		
		System.out.println("���� 04 : " + total);
		
		
		// 1�� ������ 1
		// 2�� ������ 4
		// ...
		// 10�� ������ 100
		
		total = 0;

		for (int i = 1; i < 11; i++) {
			String result = "%d�� ������ %d�Դϴ�. \n";
			System.out.printf(result, i, i*i);
		}
		
		

	}

}
