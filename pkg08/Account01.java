package pkg08;

public class Account01 {

	public static void main(String[] args) {
		// ���� ���� ���α׷� ����� (��ö��, �ڿ���)
		// ���� : ���� �̸�(���ڿ�), ������(���ڿ�), ���¹�ȣ(����), ��ġ��(����)
		// ��ö�� : soobank, sooname, soono, sodeposit 
		// �ڿ��� : heebank, heename, heeno, heedeposit
		
		// 1. ���� ���� �� �� �Ҵ��ϱ�
		String soobank; 
		String sooname;
		int soono;
		int soodeposit;
		
		String heebank; 
		String heename;
		int heeno;
		int heedeposit;
		
		soobank = "KB";
		sooname = "��ö��";
		soono = 1234;
		soodeposit = 1000;
		
		heebank = "KB";
		heename = "�ڿ���";
		heeno = 5678;
		heedeposit = 2000;
		
		// 2. �ش� �������� ����ϰų� �ٸ� �޼ҵ�� �����͸� �ѱ�ϴ�.
		
		System.out.println(sooname + "���� ���� ����");
		System.out.println("�ŷ�ó : " + soobank);
		System.out.println("������ : " + sooname);
		System.out.println("���¹�ȣ : " + soono);
		System.out.println("��ġ�� : " + soodeposit);
		System.out.println();
		
		System.out.println(heename + "���� ���� ����");
		System.out.println("�ŷ�ó : " + heebank);
		System.out.println("������ : " + heename);
		System.out.println("���¹�ȣ : " + heeno);
		System.out.println("��ġ�� : " + heedeposit);
		
		// 3. ���� ������ Class�� �̿��Ͽ� �ٽ� Ǯ�� ������.
	}

}
