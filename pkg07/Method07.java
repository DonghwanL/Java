package pkg07;
import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		// main �޼ҵ忡�� ��ĳ�ʸ� �̿��Ͽ� �̸��� ���̸� �Է� ��������.
		// �̸��� ���̸� �Է� �޾Ƽ� ������ִ� namePrint()�޼ҵ带 ������ ������.
		// ��ĳ�� nextlnt() : ���� �Է�, next() : ���ڿ� �Է�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		
		namePrint(name, age);

	}
	
	static void namePrint(String name, int age) {
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d �Դϴ�.", name, age);
	}

}
