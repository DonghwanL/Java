package pkg10;

public class AccountMain07 {

	public static void main(String[] args) {
		Account07 soo = new Account07("��ö��", 1234, 1000);
		soo.Display(); //4
		
		Account07 hee = new Account07("�ڿ���", 5678, 2000);
		hee.Display(); // 8
		
		// 								�̸� 	   ��ġ��
		// ���¹�ȣ�� ���Է½� 9999�� ������ ������.
		Account07 kim = new Account07("������", 10000);
		kim.Display();
		
	}

}
