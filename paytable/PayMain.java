package paytable;

public class PayMain {
	public static void main(String[] args) {
		PayTable[] pt = new PayTable[3];
		
		// �������� �Ű� ���� : �̸�, �⺻��, ������, �ð� �� �ٹ��ð�)
		pt[0] = new PayTable("�Ҽ���", 750000, 2, 3);
		pt[1] = new PayTable("���ָ�", 800000, 1, 4);
		pt[2] = new PayTable("���ȸ�", 650000, 6, 2);

		MySalary.incentive = 0.7;
		
		for (int i = 0; i < pt.length; i++) {
			pt[i].calc();
			pt[i].out();
			System.out.println("===================");
		}
		
	}
}