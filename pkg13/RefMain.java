package pkg13;

public class RefMain {

	public static void main(String[] args) {
		// ���� ���
		Book java = new Book("�ڹ�", 100);
		Sawon kim = new Sawon("��ö��", "����");
		
		// ���۷��� ����ȯ (�±�)
		RefCasting ref01 = new Book("JSP", 200);
		RefCasting ref02 = new Sawon("�ڿ���", "�Ǹ�");
		
		Display(ref01); // å
		Display(ref02); // ���

	}
	
	// �Ű� ���� obj�� �������̰� �η繶���ϰ� ������ �� �ִ� �̸����� ��� ����.
	private static void Display(RefCasting obj) {
//		System.out.println(obj);
		if (obj instanceof Book) {
			System.out.println("å �Դϴ�.");
			
			Book mybook = (Book)obj; // ���� (�������� ���� Ÿ������ ����� ���� ����� ����ȯ�� �ʿ���)
			System.out.println("å �̸� : " + mybook.getName());
			System.out.println("�ܰ� : " + mybook.getPrice());
			
		} else if (obj instanceof Sawon) {
			System.out.println("��� �Դϴ�.");
			
			Sawon sawon01 = (Sawon)obj; // ����
			System.out.println("��� �̸� : " + sawon01.getName());
			System.out.println("�μ��� : " + sawon01.getDepartment());
			
			
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
	}

}
