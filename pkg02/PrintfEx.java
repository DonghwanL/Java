package pkg02;

public class PrintfEx {
	// Main �޼ҵ�� Program Start Point
	// �����Ϸ��� �ݵ�� �����ؾ� ��.
	public static void main(String[] args) {
		double d = 12.3456789;
		System.out.println("�Ǽ� 1 : " + d);
		
		System.out.printf("�Ǽ� 2 : [%6.2f]\n", d);
		System.out.printf("�Ǽ� 3 : [%.3f]\n", d);
		System.out.printf("�Ǽ� 4 : [%f]\n", d);
		
		// [ 12.345678]
		System.out.printf("�Ǽ� 5 : [%11.6f]\n", d);
		
		int i= 65;
		char ch = 'a';
		
		System.out.printf("����: [%d], ���� : [%c]\n", i, ch);
		System.out.printf("����: [%4d], ���� : [%2c]\n", i, ch);
		System.out.printf("����: [%-4d], ���� : [%-2c]\n", i, ch);
		
		
		// �� ��ȯ
		System.out.printf("�Ǽ� 6 : [%f]\n", (double)i); 
		System.out.printf("���� : [%d]\n", (int)d); 
		
	}
}
