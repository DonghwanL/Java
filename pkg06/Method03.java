package pkg06;

public class Method03 {
	
	static int max(int a, int b, int c) {
		int result = 0;
		result = a > b ? a : b;
		result = result > c ? result : c;
	
		return result;
	}
	
	static int min(int a, int b, int c) {
		int result = 0;
		result = Math.min(a, b);
		result = Math.min(result, c);
		
		return result;
	}

	public static void main(String[] args) {
		// ���� 3���� ���� �߿��� ���� ū ���� ��ȯ���ִ� �޼ҵ� max �����ϱ�
		// ���� 3���� ���� �߿��� ���� ū ���� ��ȯ���ִ� �޼ҵ� min �����ϱ�
		
		int x = 3, y = 8, z = 4;
		
		int result = max(x, y, z);
		System.out.println("�ִ밪 : " + result);
		
		result = min(x, y, z);
		System.out.println("�ּҰ� : " + result);
		
	}

}
