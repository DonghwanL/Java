package pkg03;

public class LargeTest {

	public static void main(String[] args) {
		int su1 = 100;
		int su2 = 50;
		
		// �ΰ��� ���� �� ū ���� ����� ������.
		if(su1 >= su2) {
			System.out.println(su1 + "�� " + su2 + "���� Ů�ϴ�");
		} else {
			System.out.println(su1 + "�� " + su2 + "���� �۽��ϴ�");
		}
		
		int x = 5, y = 12;
		
		// x�� y�� ������� Ȯ���ϴ� ���α׷� �ۼ�
		if(y % x == 0) {
			System.out.println(x + "�� " + y + "�� ����Դϴ�." );
		} else {
			System.out.println(x + "�� " + y + "�� ����� �ƴմϴ�." );
		}
		
		String name;
		int age;
		
		name = "ȫ�浿";
		age = 13;
		
		// �̼����� üũ : 19�� �̻��� �����̶�� ����
		// ��� ���� : 13���� 'ȫ�浿'�� "�̼�����" �Դϴ�.
		
		if(age >= 19) {
			System.out.println(age + "���� \'" + name + "\'�� \"����\" �Դϴ�.");
		} else {
			System.out.println(age + "���� \'" + name + "\'�� \"�̼�����\" �Դϴ�.");
		}
		
		// su�� 3�� ����̸� ��������, �ƴϸ� ���ϱ� 5�� ����� ����ϼ���.
		int su = 3;
		
		if(su % 3 == 0) {
			System.out.println("��� : " + (su * su));
		} else {
			System.out.println("��� : " + (su + 5));
		}
		
		

	}

}
