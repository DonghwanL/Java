package pkg08;

public class Account02 { // 1. Ŭ���� ����(����)
		// static ���� = Ŭ���� ����
		static String bankname = "KB";
		
		// ��� ���� : Ŭ���� ���� ���ǵ� ���� (�ν��Ͻ� ����)
		String name;
		int no;
		int deposit;
		
		// ��� �޼ҵ� ����� (�޼ҵ� �̸�, �Ű� ����, ��ȯ Ÿ��)
		void Display() { // ������ ������ִ� ���� ����
			System.out.println(name + "���� ���� ����");
			System.out.println("�ŷ�ó : " + bankname);
			System.out.println("������ : " + name);
			System.out.println("���¹�ȣ : " + no);
			System.out.println("��ġ�� : " + deposit);
		}
	}
