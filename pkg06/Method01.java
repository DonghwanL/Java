package pkg06;

public class Method01 { 
	// ���� 2���� �Ű� ������ �Է� �޴� �޼ҵ� calc�� ���� �մϴ�.
	// �� �޼ҵ�� ��ȯ Ÿ���� ������ �Դϴ�.
	
	static int calc(int a, int b){ // a, b�� ���� �Ű� ����(�纻)
		int result = 2 * a + 3 * b - 3;
		return result;
	}

	public static void main(String[] args) {
		// y = 2 * x1 * 3 * x2 - 3
		// x1 = 3, x2 = 2, y = 6 + 6 - 3 = 9
		// x1 = 2, x2 = 5, y = 4 + 15 - 13 = 16
		
		int x1 = 3;
		int x2 = 2;
		int y = calc(x1, x2); // ȣ���ϴ� ���� x1, x2 �� �Ű� ����(����)
		
		System.out.println("y1 = " + y);
		
		
		x1 = 2;
		x2 = 5;
		y = calc(x1, x2);
		
		System.out.println("y2 = " + y);
		
	}

}
