package pkg02;

public class Condition01 {

	public static void main(String[] args) {
		// x�� y���� ũ�ٸ� 5��, �ƴϸ� 3�� ����ϴ� ���α׷� 
		int x = 3, y = 2;
		
		int result = x > y ? 5 : 3;
		
		System.out.println("���01 : " + result);
		
		// a�� b���� ũ��, ���� 5��, �׷��� ������ a+2�� ����ϴ� ���α׷� �ۼ�
		
		int a = 7, b = 4;
		result = a > b ? 5 : a+2;
		
		System.out.println("���02 : " + result);
		
		
		x = 5;
		// x�� ¦���̸� x+3��, Ȧ���̸� x�� ���� ���� ���
		result = x%2 == 0 ? x+3 : x*x; 
		
		System.out.println("���03 : " + result);
		
		x = 7;
		y = 5;
		// �� �� �߿��� ū ���� ����ϱ�
		result = x > y ? x : y;
		System.out.println("���04 : " + result);
		
		x = 7;
		y = 12;
		// x�� y�� ����̸� "��"��, �׷��� ������ "�ƴϿ�"�� ����ϱ�
		String abcd = y%x == 0 ? "��" : "�ƴϿ�";
		System.out.println("���05 : " + abcd);
		
		
		// ���� �����ڸ� �̿��Ͽ� ���� 3 ���� �߿��� ���� ū ���� ����ϼ���. �ִ� �� ���� �̸� : max
		x = 3;
		y = 8;
		int z = 4;
		int max;
		
		max = x > y ? x : y;
		max = max > z ? max : z;
		
		System.out.println("���06 : " + max);
		
		int large; // ��ø
		
		large = x > y ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("���� ū �� : " + large);		
		
		int min;
		
		min = x < y ? x : y;
		min = min < z ? min : z;
		
		System.out.println("���07 : " + min);
	
		
		// x�� y�� ���� Ȧ���̸� x��, ¦���̸� y�� ����� ������.
		// ��� ��� : 3, 8, 4 �� �ִ� ���� 8�Դϴ�. x = 3, y = 8�̹Ƿ�, ����� 3��.
		
		result = (x+y)%2 == 0 ? y : x;
		System.out.println("���08 : " + result);
		

	}

}
