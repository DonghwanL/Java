package pkg06;

public class Array05 {

	public static void main(String[] args) {
		// ��Ұ� 5���� �迭���� ���� ���� ū ���� ���ϼ���.
		// 0��° ��Ҹ� �ִ��� ����, �ݺ����� ����Ͽ� ���� �ִ�� i��° ��ҵ��� ���� ���Ѵ�.
		// i��° ��ҵ��� ���� �ִ� ������ ũ�� �ִ� ���� �ٲߴϴ�.

		double[] arr = { 0.5, 0.3, 0.2, 0.8, 0.4 };
		double max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		double min = arr[0] ; 

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
	}


}