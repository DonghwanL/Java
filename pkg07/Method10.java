package pkg07;

public class Method10 {

	public static void main(String[] args) {

		// 5�̻� 9�̸��� ������ ������ 10���� ����� ������. (random(���Ѱ�, ���Ѱ�) �޼ҵ�)
		int low = 5; // ���� ��
		int high = 9; // ���� ��

		for (int i = 1; i < 11; i++) {
			int imsi = random(low, high);
			System.out.println(imsi);
		}
	}

	static int random(int low, int high) {
		int result = (int)((high-low) * Math.random() + low);

		return result;
	}
}
