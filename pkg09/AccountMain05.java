package pkg09;

public class AccountMain05 {

	public static void main(String[] args) {
		// ��ö���� ���Ͽ� Account05 Ŭ������ 
		// getter, setter�� �����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Account05 soo = new Account05();
		
		soo.setName("��ö��"); // ����
		soo.setNo(1234);
		soo.setBalance(10000);
		
		System.out.println("������ : " + soo.getName());
		System.out.println("���� ��ȣ : " + soo.getNo());
		System.out.println("��ġ�� : " + soo.getBalance());
		
	}

}
