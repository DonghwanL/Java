package pkg07;

public class Method11 {

	public static void main(String[] args) {
		Add(1, 2); // ������ �Ű� ���� 2��
		double result = Add(3.0, 4.0); // �Ǽ��� �Ű� ���� 2�� 
		System.out.println(result);
		Add(10, 20); // ������ �Ű� ���� 2��
		Add(1, 2, 3); // ������ �Ű� ���� 3��
	}
	
	static void Add(int x, int y) {
		System.out.println("a");
		int result = x + y;
		System.out.println(result);
	}
	
	static double Add(double x, double y) {
		System.out.println("b");
		double result = x + y;
		return result;
	}
	
	static void Add(int x, int y, int z) {
		System.out.println("c");
		int result = x + y + z;
		System.out.println(result);
	}

}
