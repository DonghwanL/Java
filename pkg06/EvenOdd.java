package pkg06;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// ��Ұ� 5���� �迭�� �����ϼ���.
		// ��ĳ�ʸ� �̿��Ͽ� ������ �Է� �޽��ϴ�.
		// ��ҵ��� Ȧ���� ���հ� ¦���� ������ ����ϴ� ���α׷� 
		// �Էµ� �� (5, 4, 6, 6, 7) Ȧ���� �� : 12, ¦���� �� : 16
		
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];
		int odd = 0, even = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "��° ���� �Է� : ");
			arr[i] = scan.nextInt();
			
			if (arr[i] % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
		}
		
		System.out.println("Ȧ���� ���� : " + odd);
		System.out.println("¦���� ���� : " + even);

	}

}
