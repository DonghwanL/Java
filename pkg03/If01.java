package pkg03;

public class If01 {

	public static void main(String[] args) {
		int su = 10;

		if (su % 2 == 0) {
			System.out.println(su + "�� ¦��");
			System.out.println("ȣȣ");
		} else {
			System.out.println(su + "�� Ȧ��");
			System.out.println("����");
		}

		su = 7;
		if (su % 3 == 0) {
			System.out.println(su + "�� 3�� ����� �½��ϴ�.");
		}

		// x = 3, y = 5�϶� �� ���� ���� 3�� ����̰ų� �Ǵ� 5�� ��������� �������Ϸ� üũ
		int x = 3;
		int y = 5;
		boolean bool = (x + y) % 3 == 0 || (x + y) % 5 == 0;

		if (bool == true) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		

	}

}
