package pkg05;

public class MyArr01 {

	public static void main(String[] args) {
		// ���� ������ �ݵ�� �ʱ�ȭ�� �ʿ� �մϴ�.
		int z = 0;
		System.out.println(z);

		int x = 3;
		int y = 5;

		// ���� 3���� ���� ������ �迭 �����
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("�迭 ��� ���� : " + arr.length);

		arr[0] = x - y + 6;
		arr[2] = arr[0] + 3;
		arr[1] = arr[0] + arr[2];

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		System.out.println("���� 01 : " + total);

		String[] soshi = { "�¿�", "ȿ��", "Ƽ�Ĵ�" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(soshi[i]);
		}

	}

}
