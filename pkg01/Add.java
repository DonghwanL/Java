package pkg01;

public class Add {

	public static void main(String[] args) {
		
		// int x = 3;
		int x, y, z; // ������ ���� �� �ִ� ���� ���� �� ����
		
		// = ��ȣ�� ���� ������
		x = 3; // ���� x�� �� (3)�� ����
		y = 5;
		z = x + y;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("");
		
		x = 6; // ���� x�� �� (6)�� ����
		y = 2;
		z = x * y;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("");

//		ex) z = 2 * x + 3 * y - 4; (�� x = 1, y = 2)
		
		x = 1;
		y = 2;
		z = 2*x+3*y-4;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		
	}

}
