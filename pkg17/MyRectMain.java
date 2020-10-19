package pkg17;

public class MyRectMain {
	public static void main(String[] args) {
		Rect rectA = new Rect(2, 3);
		Rect rectB = new Rect(3, 2);
		Rect rectC = new Rect(3, 4);
		
		System.out.println(rectA == rectB);
		
		// Ŭ�������� ��ü���� �񱳸� ���Ͽ� equals��� �޼ҵ带 ���� �մϴ�.
		// Ư��, String Ŭ������ Object Ŭ������ equals �޼ҵ带 
		// �� �񱳸� �ϱ� �̸� �������̵� �صξ����ϴ�.
		
		if (rectA.equals(rectB)) { // �±޵� ���� (rect���� object)
			System.out.println("���� �մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		if (rectA.equals(rectC)) { // �±޵� ���� (rect���� object)
			System.out.println("���� �մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		if (rectB.equals(rectC)) { // �±޵� ���� (rect���� object)
			System.out.println("���� �մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}

	}

}
