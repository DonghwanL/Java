package pkg06;

public class Method02 {
	static int add(int m, int n) {
		// �޼ҵ� �ۼ�(����)
		int result = m + n;
		return result;
	}
	
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		int result = add(x, y); // �޼ҵ� ȣ��
		
		System.out.println("��� 01 : " + result);
		System.out.println("��� 02 : " + add(10, 20));
		
		for (int i = 1; i <= 3; i++) {
			result = add(x, i);
			System.out.println("��� : " + result);
		}
		
	}

}
