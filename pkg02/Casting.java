package pkg02;

public class Casting {

	public static void main(String[] args) {
		double d = 100; // �Ͻ��� ĳ����
		System.out.println("d : " + d);
		
		int i = (int)3.14; // ����� ĳ����
		System.out.println("i : " + i);
		
		System.out.println(14/5); // 2
		
		// (double)14/5--> ����� ĳ���� 14.0/ --> �Ͻ��� ĳ���� 14.0/5.0 --> 2.8
		System.out.println((double)14/5);
		
		// (double)(14/5) --> (double)(2) --> 2.0
		System.out.println((double)(14/5));
		
		
		int kor = 50, eng = 60, math = 80;
		int total = 0;
		double average = 0.0;
		
		total = kor + eng + math;
		average = total / 3; // �Ͻ��� ����ȯ 63 --> 63.0
		average = (double)total / 3; // ����� ����ȯ
				
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
		
		char ch1 = 'c';
		char ch2 = 'a';
		
		boolean bool = ch1 > ch2;
		System.out.println(bool);
		
		int result = ch1 - ch2 + 3; // 99 - 97 + 3 = 5
		System.out.println(result);
		
		
		char ch3 = 'c';
		// ���� �����ڸ� ����Ͽ� ch3�� �빮������ �ҹ��� ���� �Ǵ��ϴ� ���α׷� ����
		String str = ch3 >= 'a' && ch3 <= 'z' ? "�ҹ���" : "�빮��";
		System.out.println(str);
		

	}

}
