package pkg13;

public class RefTest {

	public static void main(String[] args) {
		Mysuper obj01 = new Mysub(); // �±�
		
		System.out.println(obj01.a);
		
		// �Ͻ��� ������ �Ұ���
//		System.out.println(obj01.b);
		
		Mysub sub = (Mysub)obj01; // ����
		System.out.println(sub.a);
		System.out.println(sub.b);
		
		obj01.haha();
		sub.hoho();
		obj01.Display(); 
	}

}
